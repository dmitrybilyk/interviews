package toknow.nikita.duplicate.readonly;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Container;
import com.extjs.gxt.ui.client.widget.ListView;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.LabelField;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Stores read-only state of a container and applies it to the container's children.
 * <p/>
 * Recursively finds all children of the attached container.
 * {@link ReadOnlyManaged} children are refreshed via {@link ReadOnlyManager#setReadOnly(boolean)}
 * and it is their responsibility to apply read only state to their own children, as they see fit.
 * Out of the other children, {@link com.extjs.gxt.ui.client.widget.form.Field} (but not {@link com.extjs.gxt.ui.client.widget.form.LabelField}) is set via {@link com.extjs.gxt.ui.client.widget.form.Field#setReadOnly(boolean)},
 * {@link com.extjs.gxt.ui.client.widget.button.Button} and {@link com.extjs.gxt.ui.client.widget.ListView} are {@link com.extjs.gxt.ui.client.widget.Component#disable() disabled} or {@link com.extjs.gxt.ui.client.widget.Component#enable() enabled}.
 * <p/>
 * Components with {@link #DO_NOT_DISABLE} data {@link com.extjs.gxt.ui.client.widget.Component#setData(String, Object) set} to true are not affected.
 */
public class ReadOnlyContainerManager implements Listener<BaseEvent>, ReadOnlyManager {
  public static final String DO_NOT_DISABLE = "doNotDisable";

  private Container<?> container;
  private boolean readOnly = false;
  private boolean stale = true; // whether the following lists need to be refreshed:
  private ArrayList<ReadOnlyManaged> managedComponents;
  private ArrayList<Component> editableComponents;
  private Set<Component> disabledComponents = new HashSet<Component>();

  public ReadOnlyContainerManager(Container<?> container) {
    attach(container);
  }

  public void attach(Container<?> container) {
    if (this.container == container) {
      return;
    }
    detach();
    this.container = container;
    container.addListener(Events.BeforeAdd, this);
    container.addListener(Events.BeforeRemove, this);
    stale = true;
  }

  public void detach() {
    if (this.container == null) {
      return;
    }
    this.container.removeListener(Events.BeforeAdd, this);
    this.container.removeListener(Events.BeforeRemove, this);
    this.container = null;
  }

  @Override
  public void handleEvent(BaseEvent be) {
    stale = true; // component lists must be re-created when a component is added or removed from the container
  }

  @Override
  public boolean isReadOnly() {
    return readOnly;
  }

  @Override
  public void setReadOnly(boolean readOnly) {
    stale |= (this.readOnly != readOnly);
    this.readOnly = readOnly;
    if (stale) {
      applyReadOnlyState();
    }
  }

  /**
   * Sets a read-only property on the specified component.
   * For a {@link com.extjs.gxt.ui.client.widget.form.Field} this is done via {@link com.extjs.gxt.ui.client.widget.form.Field#setReadOnly(boolean)}.
   * For any other component this means enabling or disabling the component.
   * This method can be overridden to provide custom behavior.
   * <p/>
   * The default implementation remembers which components it disabled,
   * and will not enable any other disabled components.
   *
   * @param component the component to set readOnly for
   * @param readOnly  the readOnly state to set
   * @return true if the state was modified (e.g., a component was enabled or disabled); false if no change was made
   */
  protected boolean setReadOnly(Component component, boolean readOnly) {
    if (component instanceof Field) {
      Field field = (Field) component;
      if (field.isReadOnly() != readOnly) {
        field.setReadOnly(readOnly);
        return true;
      }
      return false;
    }

    if (readOnly && component.isEnabled()) {
      component.disable(); // disable editing
      disabledComponents.add(component); // allow this manager to disable this component in the future
      return true;
    } else if (!readOnly && !component.isEnabled() && disabledComponents.remove(component)) {
      component.enable(); // enable editing for a component previously disabled by this manager
      return true;
    }
    return false;
  }

  protected <T extends Component> boolean isEditableComponent(T component) {
    return component instanceof Button
            || component instanceof ListView
            || (component instanceof Field && !(component instanceof LabelField));
  }

  /**
   * (Re)apply read-only state to this component's children.
   */
  protected void applyReadOnlyState() {
    if (stale) {
      managedComponents = new ArrayList<ReadOnlyManaged>();
      editableComponents = new ArrayList<Component>();
      findEditableComponents(container);
      stale = false;
    }

    for (ReadOnlyManaged component : managedComponents) {
      component.getReadOnlyManager().setReadOnly(readOnly);
    }

    for (Component component : editableComponents) {
      setReadOnly(component, readOnly);
    }
  }

  /**
   * Recursively finds all children of the specified container that are considered editable,
   * that is {@link com.extjs.gxt.ui.client.widget.form.Field} (but not {@link com.extjs.gxt.ui.client.widget.form.LabelField}), {@link com.extjs.gxt.ui.client.widget.button.Button} and {@link com.extjs.gxt.ui.client.widget.ListView}.
   * <p/>
   * Read-only-aware children are added to {@link #managedComponents}
   * (they are capable of setting read-only on themselves and their own children),
   * while the rest are added to {@link #editableComponents}.
   * Components are skipped altogether if {@link #DO_NOT_DISABLE} data
   * is {@link com.extjs.gxt.ui.client.widget.Component#setData(String, Object) set} to true.
   *
   * @param container the container to find children for
   */
  private <T extends Component> void findEditableComponents(Container<T> container) {
    for (T component : container.getItems()) {
      if (component.getData(DO_NOT_DISABLE) == Boolean.TRUE) {
        continue;
      }

      if (component instanceof ReadOnlyManaged) {
        managedComponents.add((ReadOnlyManaged) component);
        continue; // this component manages its read-only state by itself
      }

      if (isEditableComponent(component)) {
        editableComponents.add(component);
      }

      if (component instanceof Container) {
        findEditableComponents((Container<?>) component);
      }
    }
  }
}

package toknow.nikita.duplicate;

import com.extjs.gxt.ui.client.data.BaseTreeModel;

/** @author Stanislav Valenta, 25.5.2009 */
public class NavigationTreeNode extends BaseTreeModel {
  public static final String NAME = "name";
  public static final String VALUE = "value";
  public static final String ID = "id";
  public static final String ICON = "icon";


  protected NavigationTreeNode(String name, Object value) {
    set(NAME, name);
    set(VALUE, value);
  }


  public String getName() {
    return get(NAME);
  }


  public Object getValue() {
    return get(VALUE);
  }


  @Override
  public String toString() {
    return get(NAME);
  }
}

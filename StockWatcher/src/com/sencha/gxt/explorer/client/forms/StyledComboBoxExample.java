/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.forms;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.State;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance;
import com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultResources;
import com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultStyle;
import com.sencha.gxt.widget.core.client.ListView;
import com.sencha.gxt.widget.core.client.form.ComboBox;

@Detail(name = "Styled ComboBox", icon = "styledcombo", category = "Combos")
public class StyledComboBoxExample implements EntryPoint, IsWidget {

  interface CustomListViewResources extends ListViewDefaultResources {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/listview/ListView.css", "StyledComboBox.css"})
    CustomListViewStyle css();

  }

  interface CustomListViewStyle extends ListViewDefaultStyle {

  }

  interface StateProperties extends PropertyAccess<State> {
    ModelKeyProvider<State> abbr();

    LabelProvider<State> name();

    @Path("name")
    ValueProvider<State, String> nameValueProvider();
  }

  private VerticalPanel vp;

  @Override
  public Widget asWidget() {
    if (vp == null) {
      vp = new VerticalPanel();
      vp.setSpacing(10);

      StateProperties props = GWT.create(StateProperties.class);
      ListStore<State> states = new ListStore<State>(props.abbr());
      states.addAll(TestData.getStates());

      ListViewDefaultResources resources = GWT.create(CustomListViewResources.class);
      ListViewDefaultAppearance<State> appearance = new ListViewDefaultAppearance<State>(resources);

      ListView<State, String> view = new ListView<State, String>(states, props.nameValueProvider(),
          appearance);

      ComboBox<State> combo = new ComboBox<State>(states, props.name(), view);

      combo.setEmptyText("Select a state...");
      combo.setWidth(150);
      combo.setTypeAhead(true);
      combo.setTriggerAction(TriggerAction.ALL);

      vp.add(combo);
    }

    return vp;
  }

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}

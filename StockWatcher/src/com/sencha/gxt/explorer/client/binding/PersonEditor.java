/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.binding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.Style.SelectionMode;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.client.editor.ListStoreEditor;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.examples.resources.client.model.Kid;
import com.sencha.gxt.examples.resources.client.model.Person;
import com.sencha.gxt.widget.core.client.button.ButtonBar;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.DoubleField;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FormPanel.LabelAlign;
import com.sencha.gxt.widget.core.client.form.IntegerField;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridInlineEditing;

public class PersonEditor implements IsWidget, Editor<Person> {
  interface KidProperties extends PropertyAccess<Kid> {
    @Path("id")
    ModelKeyProvider<Kid> key();

    ValueProvider<Kid, String> name();
    ValueProvider<Kid, Integer> age();
  }
  private static final KidProperties props = GWT.create(KidProperties.class);

  TextField name = new TextField();
  TextField company = new TextField();
  TextField location = new TextField();

  DoubleField income = new DoubleField();

  ListStore<Kid> kidStore = new ListStore<Kid>(props.key());
  ListStoreEditor<Kid> kids = new ListStoreEditor<Kid>(kidStore);

  private FlowPanel container;

  @Override
  public Widget asWidget() {
    if (container == null) {
      container = new FlowPanel();

      // should be layout based
      int w = 275;
      name.setWidth(w);
      name.setAllowBlank(false);
      company.setWidth(w);
      location.setWidth(w);
      income.setWidth(w);

      container.add(new FieldLabel(name, "Name"));
      container.add(new FieldLabel(company, "Company"));
      container.add(new FieldLabel(location, "Location"));

      container.add(new FieldLabel(income, "Income"));

      List<ColumnConfig<Kid, ?>> columns = new ArrayList<ColumnConfig<Kid,?>>();
      final CheckBoxSelectionModel<Kid> selection = new CheckBoxSelectionModel<Kid>();
      selection.setSelectionMode(SelectionMode.MULTI);
      columns.add(selection.getColumn());
      ColumnConfig<Kid, String> name = new ColumnConfig<Kid, String>(props.name(), 200, "Name");
      columns.add(name);
      ColumnConfig<Kid, Integer> age = new ColumnConfig<Kid, Integer>(props.age(), 100, "Age");
      columns.add(age);


      final Grid<Kid> grid = new Grid<Kid>(kidStore, new ColumnModel<Kid>(columns));
      grid.setBorders(true);
      grid.setSelectionModel(selection);

      grid.getView().setForceFit(true);
      GridInlineEditing<Kid> inlineEditor = new GridInlineEditing<Kid>(grid);
      inlineEditor.addEditor(name, new TextField());
      inlineEditor.addEditor(age, new IntegerField());

      grid.setWidth(382);
      grid.setHeight(200);

      FieldLabel kidsContainer = new FieldLabel();
      kidsContainer.setText("Kids");
      kidsContainer.setLabelAlign(LabelAlign.TOP);
      kidsContainer.setWidget(grid);
      container.add(kidsContainer);

      TextButton deleteBtn = new TextButton("Delete selected rows", new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          for (Kid entityToDelete : selection.getSelectedItems()) {
            kidStore.remove(entityToDelete);
          }
        }
      });
      TextButton createBtn = new TextButton("Create new row", new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          Kid newRow = new Kid("", 0, new Date());
          kidStore.add(newRow);
        }
      });
      ButtonBar buttons = new ButtonBar();
      buttons.add(deleteBtn);
      buttons.add(createBtn);
      container.add(buttons);


    }
    return container;
  }

}

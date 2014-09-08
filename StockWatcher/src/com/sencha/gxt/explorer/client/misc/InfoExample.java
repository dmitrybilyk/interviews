/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.misc;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.NumberField;
import com.sencha.gxt.widget.core.client.form.NumberPropertyEditor.IntegerPropertyEditor;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.validator.EmptyValidator;
import com.sencha.gxt.widget.core.client.form.validator.MinNumberValidator;
import com.sencha.gxt.widget.core.client.info.DefaultInfoConfig;
import com.sencha.gxt.widget.core.client.info.Info;
import com.sencha.gxt.widget.core.client.info.InfoConfig.InfoPosition;

@Detail(name = "Info", icon = "info", category = "Misc")
public class InfoExample implements IsWidget, EntryPoint{

  private VerticalPanel panel;
  
  @Override
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  @Override
  public Widget asWidget() {
    if (panel ==  null) {
      panel = new VerticalPanel();
      panel.setSpacing(10);
      
      final TextField title = new TextField();
      title.setValue("Test Title");
      
      final TextField text = new TextField();
      text.setValue("This is the info text");
      
      final SimpleComboBox<InfoPosition> position = new SimpleComboBox<InfoPosition>(new StringLabelProvider<InfoPosition>());
      position.add(InfoPosition.TOP_LEFT);
      position.add(InfoPosition.TOP_RIGHT);
      position.add(InfoPosition.BOTTOM_LEFT);
      position.add(InfoPosition.BOTTOM_RIGHT);
      
      position.setEditable(false);
      position.setTriggerAction(TriggerAction.ALL);
      position.setValue(InfoPosition.TOP_RIGHT);
      
      final NumberField<Integer> display = new NumberField<Integer>(new IntegerPropertyEditor());
      display.setValue(2500);
      display.addValidator(new EmptyValidator<Integer>());
      display.addValidator(new MinNumberValidator<Integer>(100));
      
      TextButton show = new TextButton("Show Info");
      show.addSelectHandler(new SelectHandler() {
        
        @Override
        public void onSelect(SelectEvent event) {
          if (display.isCurrentValid()) {
            DefaultInfoConfig config = new DefaultInfoConfig(title.getValue(), text.getValue());
            config.setPosition(position.getValue());
            config.setDisplay(display.getValue());
            Info.display(config);
          } else {
            AlertMessageBox d = new AlertMessageBox("Alert", "Please increase the Display (ms) to 100+.");
            d.show();
          }
        }
      });
      
   
      panel.add(new FieldLabel(title, "Title"));
      panel.add(new FieldLabel(text, "Text"));
      panel.add(new FieldLabel(position, "Position"));
      panel.add(new FieldLabel(display, "Display (ms)"));
      
    
      panel.add(show);
      panel.setCellHorizontalAlignment(show, HasHorizontalAlignment.ALIGN_RIGHT);
      
    }
    
    return panel;
  }

}

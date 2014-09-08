/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.window;

import java.util.Date;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.examples.resources.client.Resources;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Dialog;
import com.sencha.gxt.widget.core.client.Dialog.PredefinedButton;
import com.sencha.gxt.widget.core.client.button.ButtonBar;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

@Detail(name = "Dialog", icon = "dialog", category = "Windows")
public class DialogExample implements IsWidget, EntryPoint {

  private ButtonBar buttons;

  @Override
  public Widget asWidget() {
    if (buttons == null) {
      // Simple
      final Dialog simple = new Dialog();
      simple.setHeadingText("Dialog Test");
      simple.setPredefinedButtons(PredefinedButton.YES, PredefinedButton.NO);
      simple.setBodyStyleName("pad-text");
      simple.add(new Label(TestData.DUMMY_TEXT_SHORT));
      simple.getBody().addClassName("pad-text");
      simple.setHideOnButtonClick(true);
      simple.setWidth(300);

      // Layout
      final Dialog complex = new Dialog();
      complex.setBodyBorder(false);
      complex.getHeader().setIcon(Resources.IMAGES.side_list());
      complex.setHeadingText("BorderLayout Dialog");
      complex.setWidth(400);
      complex.setHeight(225);
      complex.setHideOnButtonClick(true);

      BorderLayoutContainer layout = new BorderLayoutContainer();
      complex.add(layout);

      // Layout - west
      ContentPanel panel = new ContentPanel();
      panel.setHeadingText("West");
      BorderLayoutData data = new BorderLayoutData(150);
      data.setMargins(new Margins(0, 5, 0, 0));
      panel.setLayoutData(data);
      layout.setWestWidget(panel);

      // Layout - center
      panel = new ContentPanel();
      panel.setHeadingText("Center");
      layout.setCenterWidget(panel);

      // Auto Size - See the JavaDoc for Window for more information on auto size
      final FlowLayoutContainer flc = new FlowLayoutContainer();
      flc.add(new HTML("Press Add or Remove to modify content"));
      final Dialog autoSize = new Dialog();
      autoSize.setBodyBorder(false);
      autoSize.setHeadingText("Auto Size Dialog");
      autoSize.setHideOnButtonClick(true);
      autoSize.setWidget(flc);
      autoSize.setPixelSize(-1, -1);
      autoSize.setMinWidth(0);
      autoSize.setMinHeight(0);
      autoSize.setResizable(false);
      autoSize.setShadow(true);
      autoSize.addButton(new TextButton("Add", new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          addAutoSizeContent(flc);
          autoSize.forceLayout();
        }
      }));
      autoSize.addButton(new TextButton("Remove", new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          int lastWidget = flc.getWidgetCount() - 1;
          if (lastWidget > 0) {
            flc.remove(lastWidget);
            autoSize.forceLayout();
          }
        }
      }));

      // Buttons
      buttons = new ButtonBar();
      buttons.setWidth(400);
      buttons.getElement().setMargins(10);

      TextButton b = new TextButton("Simple");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          simple.show();
        }
      });
      buttons.add(b);

      b = new TextButton("Layout");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          complex.show();
        }
      });
      buttons.add(b);

      b = new TextButton("Auto Size");
      b.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          autoSize.show();
        }
      });

      buttons.add(b);

      // Add some basic content to begin with
      for (int i=0; i < 5; i++) {
        addAutoSizeContent(flc);
      }
    }

    return buttons;
  }

  private void addAutoSizeContent(FlowLayoutContainer flc) {
    int widgetCount = flc.getWidgetCount();
    StringBuilder s = new StringBuilder(widgetCount);
    for (int i = 0; i < widgetCount; i++) {
      s.append(" *");
    }
    flc.add(new HTML(new Date().toString() + s));
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}

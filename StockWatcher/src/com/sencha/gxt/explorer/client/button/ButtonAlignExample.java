/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.button;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment.HorizontalAlignmentConstant;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.info.Info;

@Detail(name = "Button Aligning", icon = "buttonaligning", category = "Button")
public class ButtonAlignExample implements IsWidget, EntryPoint {

  public static final HorizontalAlignmentConstant[] ALIGNMENTS = {
      HasHorizontalAlignment.ALIGN_LEFT, HasHorizontalAlignment.ALIGN_CENTER, HasHorizontalAlignment.ALIGN_RIGHT};

  private FlowLayoutContainer con;

  public Widget asWidget() {
    if (con == null) {
      con = new FlowLayoutContainer();
      con.setLayoutData(new MarginData(10));
      SelectHandler sh = new SelectHandler() {

        @Override
        public void onSelect(SelectEvent event) {
          Info.display("Click", ((TextButton) event.getSource()).getText() + " clicked");
        }
      };

      int i = 1;
      for (BoxLayoutPack align : BoxLayoutPack.values()) {
        FramedPanel cp = new FramedPanel();

        cp.setHeadingText("Button Aligning Example: " + align.toString().toLowerCase());
        for (int j = 0; j < 3; i++, j++) {
          TextButton b = new TextButton("Button " + i);
          b.addSelectHandler(sh);
          cp.addButton(b);
        }
        cp.setButtonAlign(align);
        cp.setPixelSize(500, 150);

        HTML c = new HTML();
        cp.addStyleName("white-bg");
        cp.add(c);
        cp.getElement().setMargins(new Margins(5));
        con.add(cp);
      }
    }

    return con;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }
}

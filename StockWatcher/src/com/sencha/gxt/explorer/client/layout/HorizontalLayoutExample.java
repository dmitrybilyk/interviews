/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.layout;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.ContentPanel.ContentPanelAppearance;
import com.sencha.gxt.widget.core.client.FramedPanel.FramedPanelAppearance;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;

@Detail(name = "HorizontalLayout", icon = "columnlayout", category = "Layouts")
public class HorizontalLayoutExample implements IsWidget, EntryPoint {

  private SimpleContainer con;

  @Override
  public Widget asWidget() {
    if (con == null) {
      ContentPanel panel = new ContentPanel(GWT.<ContentPanelAppearance> create(FramedPanelAppearance.class));
      panel.setHeadingText("HorizontalLayout Example");
      panel.setPixelSize(400, 300);
      panel.setCollapsible(true);

      HorizontalLayoutContainer hlc = new HorizontalLayoutContainer();
      panel.setWidget(hlc);

      hlc.add(createLabel("Test Label 1"), new HorizontalLayoutData(-1, 1, new Margins(4)));
      hlc.add(createLabel("Test Label 2"), new HorizontalLayoutData(1, 1, new Margins(4, 0, 4, 0)));
      hlc.add(createLabel("Test Label 3"), new HorizontalLayoutData(-1, 1, new Margins(4)));

      con = new SimpleContainer();
      con.setStyleName("margin-10");
      con.add(panel);
    }
    
    return con;
  }

  private Label createLabel(String text) {
    Label label = new Label(text);
    label.getElement().getStyle().setProperty("whiteSpace", "nowrap");
    label.addStyleName(ThemeStyles.get().style().border());
    label.addStyleName("pad-text white-bg");

    return label;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}

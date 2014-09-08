/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.layout;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;

@Detail(name = "CenterLayout", icon = "centerlayout", category = "Layouts", fit = true)
public class CenterLayoutExample implements IsWidget, EntryPoint {

  private CenterLayoutContainer centerLayoutContainer;

  @Override
  public Widget asWidget() {
    if (centerLayoutContainer == null) {
      centerLayoutContainer = new CenterLayoutContainer();
  
      ContentPanel panel = new ContentPanel();
      panel.setBodyStyle("padding: 6px");
      panel.setHeadingText("CenterLayout");
      panel.add(new Label("I should be centered"));
      panel.setWidth(200);
  
      centerLayoutContainer.add(panel);
    }
    
    return centerLayoutContainer;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }
  
}

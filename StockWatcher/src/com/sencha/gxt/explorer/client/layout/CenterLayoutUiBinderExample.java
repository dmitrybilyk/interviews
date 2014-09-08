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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.explorer.client.model.Example.Detail;

@Detail(name = "CenterLayout (UiBinder)", icon = "centerlayout", category = "Layouts", fit = true, files = "CenterLayoutUiBinderExample.ui.xml")
public class CenterLayoutUiBinderExample implements IsWidget, EntryPoint {

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
  
  interface MyUiBinder extends UiBinder<Widget, CenterLayoutUiBinderExample> {
  }

  private Widget widget;

  public Widget asWidget() {
    if (widget == null) {
      widget = uiBinder.createAndBindUi(this);
    }
    return widget;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}

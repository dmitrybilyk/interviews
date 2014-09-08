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
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.resources.ThemeStyles.Styles;
import com.sencha.gxt.explorer.client.model.Example.Detail;

@Detail(name = "VerticalLayout (UiBinder)", icon = "rowlayout", category = "Layouts", files = "VerticalLayoutUiBinderExample.ui.xml")
public class VerticalLayoutUiBinderExample implements IsWidget, EntryPoint {

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  interface MyUiBinder extends UiBinder<Widget, VerticalLayoutUiBinderExample> {
  }

  @UiField(provided = true)
  Styles themeStyles = ThemeStyles.get().style();

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

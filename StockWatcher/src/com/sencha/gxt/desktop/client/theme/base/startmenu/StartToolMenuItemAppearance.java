/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktop.client.theme.base.startmenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.blue.client.menu.BlueMenuItemAppearance;

public class StartToolMenuItemAppearance extends BlueMenuItemAppearance {

  public interface StartToolMenuItemResources extends BlueMenuItemResources, ClientBundle {
    
    @Override
    @Source({"com/sencha/gxt/theme/base/client/menu/Item.css",
        "com/sencha/gxt/theme/blue/client/menu/BlueItem.css",
        "com/sencha/gxt/theme/base/client/menu/MenuItem.css", //
        "com/sencha/gxt/theme/blue/client/menu/BlueMenuItem.css", //
        "StartItem.css",
        "StartToolMenuItem.css"})
    StartToolMenuItemStyle style();

    ImageResource itemOver();

  }

  public interface StartToolMenuItemStyle extends BlueMenuItemStyle {
    
  }

  public StartToolMenuItemAppearance() {
    this(GWT.<StartToolMenuItemResources> create(StartToolMenuItemResources.class),
        GWT.<MenuItemTemplate> create(MenuItemTemplate.class));
  }

  public StartToolMenuItemAppearance(StartToolMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
  }

}

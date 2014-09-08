/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktopapp.client.spreadsheet;

import com.google.web.bindery.autobean.shared.AutoBean;

public class TableCategory {
  public static int incrementNextRowId(AutoBean<Table> instance) {
    Table table = instance.as();
    int nextRowId = table.getNextRowId();
    table.setNextRowId(nextRowId + 1);
    return nextRowId;
  }
}

/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktopapp.client.spreadsheet;

import com.google.gwt.user.client.ui.HasWidgets;
import com.sencha.gxt.desktopapp.client.persistence.FileModel;

public interface SpreadsheetChartPresenter {

  void configure(FileModel fileModel, Worksheet worksheet);

  void go(HasWidgets hasWidgets);

  void updateTitle();

}

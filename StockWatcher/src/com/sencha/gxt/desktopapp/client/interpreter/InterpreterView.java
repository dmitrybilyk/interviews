/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktopapp.client.interpreter;

import com.sencha.gxt.desktopapp.client.FileBasedMiniAppView;

public interface InterpreterView extends FileBasedMiniAppView {

  void print(String value);

}
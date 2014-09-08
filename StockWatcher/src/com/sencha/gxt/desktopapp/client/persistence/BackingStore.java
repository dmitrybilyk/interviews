/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktopapp.client.persistence;

public interface BackingStore {

  void clear();

  String getItem(String key);

  void removeItem(String key);

  void setItem(String key, String data);

}

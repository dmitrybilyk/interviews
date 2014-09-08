/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.desktopapp.client;

public interface FileBasedMiniAppPresenter extends Presenter {

  void bind();

  void onClose();

  void onSave();

  void onContentUpdate();

  void unbind();
}

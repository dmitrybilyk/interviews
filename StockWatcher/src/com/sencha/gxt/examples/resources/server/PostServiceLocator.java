/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.examples.resources.server;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public class PostServiceLocator implements ServiceLocator {

  @Override
  public Object getInstance(Class<?> clazz) {
    return new PostService();
  }

}

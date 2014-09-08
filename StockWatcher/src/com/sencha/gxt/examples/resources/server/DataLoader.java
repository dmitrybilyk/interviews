/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.examples.resources.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DataLoader implements ServletContextListener {

  @Override
  public void contextDestroyed(ServletContextEvent event) {

  }

  @Override
  public void contextInitialized(ServletContextEvent event) {
    MusicDataLoader.initMusic(event);
  }

}

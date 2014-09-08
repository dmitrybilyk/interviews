/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.examples.resources.client.model;

import java.util.Date;

public interface StockProxy {

  public double getChange();

  public Date getDate();

  public String getName();

  public String getSymbol();

  public void setChange(double change);

  public void setDate(Date date);

  public void setName(String name);

  public void setSymbol(String symbol);

}

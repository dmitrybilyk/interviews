/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.model;

import java.util.ArrayList;
import java.util.List;

public class Category extends NamedModel {

  private List<Example> examples;

  public Category(String name) {
    super(name);

    examples = new ArrayList<Example>();
  }

  public void addExample(Example example) {
    examples.add(example);
  }

  public List<Example> getExamples() {
    return examples;
  }

  public void setExamples(List<Example> examples) {
    this.examples = examples;
  }

  @Override
  public String toString() {
    String s = "Category(";
    s += "name=" + getName() + "";
    s +=")";
    return s;
  }

}

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

import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.data.shared.TreeStore.TreeNode;
import com.sencha.gxt.explorer.client.ExplorerApp;

public abstract class ExampleModel {
  protected List<Category> categories = new ArrayList<Category>();

  public Example findExampleByName(String name) {
    List<Example> list = getExamplesAsList();
    for (int i = 0; i < list.size(); i++) {
      Example ex = list.get(i);
      if (ex.getName().equals(name)) {
        return ex;
      }
    }
    return null;
  }
  
  public Example findExample(String id) {
    List<Example> list = getExamplesAsList();
    for (int i = 0; i < list.size(); i++) {
      Example ex = list.get(i);
      if (ex.getId().equals(id)) {
        return ex;
      }
    }
    return null;
  }

  public List<Example> getExamplesAsList() {
    List<Example> list = new ArrayList<Example>();
    for (int i = 0; i < categories.size(); i++) {
      Category c = categories.get(i);
      for (int j = 0; j < c.getExamples().size(); j++) {
        list.add(c.getExamples().get(j));
      }
    }

    return list;
  }

  protected ExampleModel() {
    // protected to it isn't instantiated directly, except by generated subclass
  }

  public List<Category> getCategories() {
    return categories;
  }

  public List<TreeNode<NamedModel>> getModels() {
    List<TreeNode<NamedModel>> models = new ArrayList<TreeNode<NamedModel>>();
    for (final Category c : categories) {
      if (c.getName().equals(ExplorerApp.OVERVIEW_CATEGORY)) {
        continue;
      }
      final List<TreeNode<NamedModel>> examples = new ArrayList<TreeNode<NamedModel>>();
      for (final Example e : c.getExamples()) {
        examples.add(new TreeNode<NamedModel>() {
          @Override
          public List<? extends TreeNode<NamedModel>> getChildren() {
            return null;
          }

          @Override
          public NamedModel getData() {
            return e;
          }
        });
      }
      models.add(new TreeNode<NamedModel>() {
        @Override
        public List<? extends TreeNode<NamedModel>> getChildren() {
          return examples;
        }

        @Override
        public NamedModel getData() {
          return c;
        }
      });
    }

    return models;
  }

}

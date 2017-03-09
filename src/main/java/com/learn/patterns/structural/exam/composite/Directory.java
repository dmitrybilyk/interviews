package com.learn.patterns.structural.exam.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 09.03.17.
 */
public class Directory extends Item {
  private List<Item> items = new ArrayList<>();

  public void addItem(Item item) {
    items.add(item);
  }

  public void clear() {
    items.clear();
  }

  public void printAllNames() {
    for (Item item : items) {
      System.out.println(item.getName());
    }
  }

}

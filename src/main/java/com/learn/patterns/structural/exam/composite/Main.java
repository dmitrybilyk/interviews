package com.learn.patterns.structural.exam.composite;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Directory directory = new Directory();
    Item item = new Item();
    item.setSize(150);
    item.setName("some item");
    directory.addItem(item);
    Directory childDirectory = new Directory();
    childDirectory.setName("dir name sub");
    directory.addItem(childDirectory);
    directory.printAllNames();
  }
}

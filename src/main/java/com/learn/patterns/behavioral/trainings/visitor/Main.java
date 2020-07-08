package com.learn.patterns.behavioral.trainings.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 16.01.17.
 */
public class Main {
  public static void main(String[] args) {
    List<Component> components = Arrays.asList(new BookComponent(), new TextBookComponent());
    for (Component component : components) {
      component.accept(new SellVisitor());
    }
  }
}

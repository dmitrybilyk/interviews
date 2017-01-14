package com.learn.patterns.behavioral.visitor.custom1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 14.01.17.
 */
public class Main {
  public static void main(String[] args) {
    List<VisitorItem> visitorItems = new ArrayList<>();
    visitorItems.add(new FlatItem());
    visitorItems.add(new HouseItem());

    CleaningCostVisitor cleaningCostVisitor = new CleaningCostVisitorImpl();

    long sum = 0;
    for (VisitorItem visitorItem : visitorItems) {
      sum += visitorItem.accept(cleaningCostVisitor);
    }

    System.out.println("Total = " + sum);
  }
}

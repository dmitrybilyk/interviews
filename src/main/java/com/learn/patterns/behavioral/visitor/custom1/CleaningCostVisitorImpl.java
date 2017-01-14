package com.learn.patterns.behavioral.visitor.custom1;

/**
 * Created by dmitry on 14.01.17.
 */
public class CleaningCostVisitorImpl implements CleaningCostVisitor {

  @Override
  public long visit(FlatItem visitorItem) {
    System.out.println("Cleaning the flat");
    return 10;
  }

  @Override
  public long visit(HouseItem visitorItem) {
    System.out.println("Cleaning the house");
    return 20;
  }

}

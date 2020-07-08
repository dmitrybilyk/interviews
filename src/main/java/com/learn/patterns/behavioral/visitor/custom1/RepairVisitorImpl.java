package com.learn.patterns.behavioral.visitor.custom1;

/**
 * Created by dmitry on 14.01.17.
 */
public class RepairVisitorImpl implements RepairVisitor {

  @Override
  public long visit(FlatItem visitorItem) {
    System.out.println("Repairing the flat");
    return 100;
  }

  @Override
  public long visit(HouseItem visitorItem) {
    System.out.println("Repairing the house");
    return 120;
  }

}

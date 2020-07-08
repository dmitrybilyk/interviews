package com.learn.patterns.behavioral.visitor.custom1;

/**
 * Created by dmitry on 14.01.17.
 */
public class HouseItem implements VisitorItem{
  @Override
  public long accept(CleaningCostVisitor visitor) {
    return visitor.visit(this);
  }

  @Override
  public long accept(RepairVisitor visitor) {
    return visitor.visit(this);
  }
}

package com.learn.patterns.behavioral.visitor.custom1;

/**
 * Created by dmitry on 14.01.17.
 */
public interface CleaningCostVisitor {
  long visit(FlatItem flatItem);
  long visit(HouseItem houseItem);
}

package com.learn.patterns.behavioral.visitor.custom1;

/**
 * Created by dmitry on 14.01.17.
 */
public interface VisitorItem {
  long accept(CleaningCostVisitor visitor);
}

package com.learn.patterns.behavioral.visitor.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public class HockeyMatch implements MatchItemElement {
  @Override
  public void accept(MatchWatchCostVisitor visitor) {
    visitor.visit(this);
  }
}

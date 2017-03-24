package com.learn.patterns.behavioral.visitor.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public class MatchWatchCostVisitorImpl implements MatchWatchCostVisitor {
  @Override
  public void visit(HockeyMatch hockeyMatch) {
    System.out.println(40);
  }

  @Override
  public void visit(FootballMatch hockeyMatch) {
    System.out.println(50);;
  }
}

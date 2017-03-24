package com.learn.patterns.behavioral.visitor.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public interface MatchWatchCostVisitor {
  void visit(HockeyMatch hockeyMatch);
  void visit(FootballMatch hockeyMatch);
}

package com.learn.patterns.behavioral.strategypattern.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class UsageContext {
  private GoStrategy strategy;

  public void setStrategy(GoStrategy strategy) {
    this.strategy = strategy;
  }

  void execute() {
    strategy.execute();
  }
}

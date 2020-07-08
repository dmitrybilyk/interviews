package com.learn.patterns.behavioral.trainings.strategy;

/**
 * Created by dmitry on 16.01.17.
 */
public class Context {
  private CountSumStrategy countSumStrategy;

  public Context(CountSumStrategy countSumStrategy) {
    this.countSumStrategy = countSumStrategy;
  }

  public Context() {

  }

  public void setCountSumStrategy(CountSumStrategy countSumStrategy) {
    this.countSumStrategy = countSumStrategy;
  }

  int executeCount() {
      return countSumStrategy.count();
  }

}

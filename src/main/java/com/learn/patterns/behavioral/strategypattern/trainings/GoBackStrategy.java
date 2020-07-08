package com.learn.patterns.behavioral.strategypattern.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class GoBackStrategy implements GoStrategy {
  @Override
  public void execute() {
    System.out.println("I'm going back");
  }
}

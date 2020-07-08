package com.learn.patterns.behavioral.strategypattern.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class Main {
  public static void main(String[] args) {
    UsageContext context = new UsageContext();
    context.setStrategy(new GoAheadStrategy());
    context.execute();
    context.setStrategy(new GoBackStrategy());
    context.execute();
  }
}

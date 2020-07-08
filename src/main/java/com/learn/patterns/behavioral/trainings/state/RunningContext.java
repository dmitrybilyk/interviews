package com.learn.patterns.behavioral.trainings.state;

/**
 * Created by dmitry on 16.01.17.
 */
public class RunningContext implements ActivityContext{
  @Override
  public void doAction() {
    System.out.println("I'm running");
  }
}

package com.learn.patterns.structural.trainings.proxy;

/**
 * Created by dmitry on 26.01.17.
 */
public class TrainRiding implements Driving {
  @Override
  public void ride(String position) {
    System.out.println("We are riding you, " + position);
  }
}

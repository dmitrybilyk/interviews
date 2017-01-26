package com.learn.patterns.structural.trainings.proxy;

/**
 * Created by dmitry on 26.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Driving driving = new TrainingRidingCensor();
    driving.ride("russian");
    driving.ride("ukrainian");
  }
}

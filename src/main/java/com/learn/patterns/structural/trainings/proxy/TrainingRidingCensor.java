package com.learn.patterns.structural.trainings.proxy;

/**
 * Created by dmitry on 26.01.17.
 */
public class TrainingRidingCensor implements Driving {
  private String allowedPosition = "ukrainian";
  private Driving driving;

  public TrainingRidingCensor() {
  }

  @Override
  public void ride(String position) {
    if (position.equals(allowedPosition)) {
      if (driving == null){
        driving = new TrainRiding();
      }
      driving.ride(position);
    } else {
      System.out.println("not allowed");
    }
  }
}

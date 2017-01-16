package com.learn.patterns.behavioral.trainings.state;

/**
 * Created by dmitry on 16.01.17.
 */
public class Main {
  public static void main(String[] args) {
    PhysicalActivityContext physicalActivityContext = new PhysicalActivityContext();
    physicalActivityContext.setContext(new RunningContext());
    physicalActivityContext.doAction();

    physicalActivityContext.setContext(new HikingContext());
    physicalActivityContext.doAction();
  }
}

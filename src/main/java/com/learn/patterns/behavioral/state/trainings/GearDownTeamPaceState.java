package com.learn.patterns.behavioral.state.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class GearDownTeamPaceState implements TeamPaceState {
  @Override
  public void changePace() {
    System.out.println("Speed is geared down");
  }
}

package com.learn.patterns.behavioral.state.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class TeamPaceContext implements TeamPaceState {
  private TeamPaceState state;

  public TeamPaceState getState() {
    return state;
  }

  public void setState(TeamPaceState state) {
    this.state = state;
  }

  @Override
  public void changePace() {
    state.changePace();
  }
}

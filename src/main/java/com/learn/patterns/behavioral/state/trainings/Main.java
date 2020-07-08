package com.learn.patterns.behavioral.state.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class Main {
  public static void main(String[] args) {
    TeamPaceContext teamPaceContext = new TeamPaceContext();
    teamPaceContext.setState(new GearUpTeamPaceState());
    teamPaceContext.changePace();
    teamPaceContext.changePace();
    teamPaceContext.setState(new GearDownTeamPaceState());
    teamPaceContext.changePace();
  }
}

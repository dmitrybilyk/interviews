package com.learn.patterns.structural.trainings.facade;

/**
 * Created by dmitry on 27.01.17.
 */
public class HockeyMatchPreparation extends MatchPreparation {
  @Override
  public void prepareMatch(String topPartyName) {
    System.out.println("prepare hockey field");
    super.prepareMatch(topPartyName);
  }
}

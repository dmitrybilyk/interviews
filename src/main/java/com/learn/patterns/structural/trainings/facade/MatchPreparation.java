package com.learn.patterns.structural.trainings.facade;

/**
 * Created by dmitry on 27.01.17.
 */
public class MatchPreparation {
  private MatchType matchType;

  public MatchPreparation() {
  }

  public MatchPreparation(MatchType matchType) {
    this.matchType = matchType;
  }

  public enum MatchType {
    FOOTBALL, HOCKEY, TENNIS
  }
  public void prepareMatch(String topPartyName) {
    System.out.println("Sell tickets to " + topPartyName);
  }
}

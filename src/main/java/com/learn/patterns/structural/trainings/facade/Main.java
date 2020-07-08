package com.learn.patterns.structural.trainings.facade;

/**
 * Created by dmitry on 27.01.17.
 */
public class Main {
  public static void main(String[] args) {
//    MatchPreparation matchPreparation = new FootballMatchPreparation();
//    matchPreparation.prepareMatch("Shakhtar");
    MatchPreparationFacade matchPreparationFacade = new MatchPreparationFacade();
    matchPreparationFacade.doAllStuff(MatchPreparation.MatchType.FOOTBALL, "Barca");
  }
}

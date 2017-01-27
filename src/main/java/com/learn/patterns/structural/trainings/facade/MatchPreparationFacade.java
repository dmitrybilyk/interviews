package com.learn.patterns.structural.trainings.facade;

import static com.learn.patterns.structural.trainings.facade.MatchPreparation.MatchType.*;

/**
 * Created by dmitry on 27.01.17.
 */
public class MatchPreparationFacade {
  public void doAllStuff(MatchPreparation.MatchType matchType, String topPartyName) {
    MatchPreparation matchPreparation = null;
    switch (matchType) {
      case FOOTBALL:
        matchPreparation = new FootballMatchPreparation();
        break;
      case HOCKEY:
        matchPreparation = new HockeyMatchPreparation();
        break;
      case TENNIS:
        matchPreparation = new TennisMatchPreparation();
        break;
      default:
        System.out.println("We can't prepare this match");
    }
    matchPreparation.prepareMatch(topPartyName);
  }
}

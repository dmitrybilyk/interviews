package com.learn.interview_questions.patterns.creational.factory.factorymethod.classic;

/**
 * Created by dmitry on 06.02.17.
 */
public class HockeyPlayerFactory extends PlayerFactory {
  @Override
  public Player createPlayer() {
    return new HockeyPlayer();
  }
}

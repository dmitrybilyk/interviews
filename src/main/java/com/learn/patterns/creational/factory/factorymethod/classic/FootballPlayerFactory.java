package com.learn.patterns.creational.factory.factorymethod.classic;

/**
 * Created by dmitry on 06.02.17.
 */
public class FootballPlayerFactory extends PlayerFactory {
  @Override
  public Player createPlayer() {
    return new FootballPlayer();
  }
}

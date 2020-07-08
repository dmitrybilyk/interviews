package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class FootballPlayerFactory extends PlayerFactory {
  @Override
  public Player getPlayer(String name) {
    return new FootballPlayer(name);
  }
}

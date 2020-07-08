package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class HockeyPlayerFactory extends PlayerFactory {
  @Override
  public Player getPlayer(String name) {
    return new HockeyPlayer(name);
  }
}

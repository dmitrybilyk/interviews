package com.learn.patterns.creational.factory.factorymethod.common;

/**
 * Created by dmitry on 06.02.17.
 */
public class PlayerFactory {
  public static Player createPlayer(String type) {
    if (type.equals("foot")) {
      return new FootballPlayer();
    } else {
      return new HockeyPlayer();
    }
  }
}

package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class FootballPlayer extends Player {
  public FootballPlayer(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return "football" + " " + super.getName();
  }
}

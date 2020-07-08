package com.learn.patterns.creational.trainings1.factorymethod;

/**
 * Created by dmitry on 18.02.17.
 */
public class HockeyPlayer extends Player {
  public HockeyPlayer(String name) {
    super(name);
  }

  @Override
  public String getName() {
    return "hockey" + " " + super.getName();
  }
}

package com.learn.patterns.creational.trainings.prototype;

/**
 * Created by dmitry on 09.02.17.
 */
public class HockeyPlayer extends PlayerPrototype {
  public HockeyPlayer(String name, int age) {
    super(name, age);
  }

  @Override
  protected String getAbility() {
    return "I can kick the disc";
  }
}

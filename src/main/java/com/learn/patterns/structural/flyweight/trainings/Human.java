package com.learn.patterns.structural.flyweight.trainings;

/**
 * Created by dmitry on 08.03.17.
 */
public class Human {
  private String name;
  private String race;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  @Override
  public String toString() {
    return name + " " + race;
  }
}

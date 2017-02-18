package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class Player {
  private int totalSkillLevel;
  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTotalSkillLevel() {
    return totalSkillLevel;
  }

  public void setTotalSkillLevel(int totalSkillLevel) {
    this.totalSkillLevel = totalSkillLevel;
  }
}

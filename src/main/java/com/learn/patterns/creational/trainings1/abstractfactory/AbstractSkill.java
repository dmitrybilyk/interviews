package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class AbstractSkill {
  public int getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(int skillLevel) {
    this.skillLevel = skillLevel;
  }

  protected int skillLevel;
}

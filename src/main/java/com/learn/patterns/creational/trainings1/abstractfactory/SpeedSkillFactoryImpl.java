package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class SpeedSkillFactoryImpl extends AbstractSkillFactory {
  @Override
  public AbstractSkill getSkill() {
    return new SpeedSkill(10);
  }
}

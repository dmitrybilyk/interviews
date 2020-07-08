package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class TechnicsSkillFactoryImpl extends AbstractSkillFactory {
  @Override
  public AbstractSkill getSkill() {
    return new TechnicsSkill(5);
  }
}

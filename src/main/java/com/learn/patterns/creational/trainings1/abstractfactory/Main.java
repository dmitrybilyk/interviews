package com.learn.patterns.creational.trainings1.abstractfactory;

/**
 * Created by dmitry on 18.02.17.
 */
public class Main {
  public static void main(String[] args) {
    Player zidan = new Player("Zidan");
    AbstractSkillFactory abstractSkillFactory = new DurabilitySkillFactoryImpl();
    zidan.setTotalSkillLevel(zidan.getTotalSkillLevel() + abstractSkillFactory.getSkill().getSkillLevel());
    abstractSkillFactory = new SpeedSkillFactoryImpl();
    zidan.setTotalSkillLevel(zidan.getTotalSkillLevel() + abstractSkillFactory.getSkill().getSkillLevel());
    abstractSkillFactory = new TechnicsSkillFactoryImpl();
    zidan.setTotalSkillLevel(zidan.getTotalSkillLevel() + abstractSkillFactory.getSkill().getSkillLevel());
    System.out.println(zidan.getTotalSkillLevel());
  }
}

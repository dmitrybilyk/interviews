package com.learn.patterns.behavioral.templatemethod.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public class HockeyPlayerCreator extends PlayerCreator {
  @Override
  protected void createSkills() {
    System.out.println("Creating sill for hockey player");
  }

  @Override
  protected void createAppearance() {
    System.out.println("Creating appearance for hockey player");
  }
}

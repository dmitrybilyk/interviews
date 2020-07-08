package com.learn.patterns.behavioral.templatemethod.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public abstract class PlayerCreator {
  public final void createPlayer() {
    createBody();
    createAppearance();
    createSkills();
  }

  protected abstract void createSkills();

  protected void createBody() {
    System.out.println("Body is being created");
  }

  protected abstract void createAppearance();
}

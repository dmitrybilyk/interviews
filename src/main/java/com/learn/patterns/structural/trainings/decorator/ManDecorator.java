package com.learn.patterns.structural.trainings.decorator;

/**
 * Created by dmitry on 25.01.17.
 */
public class ManDecorator implements Human {
  protected Human human;

  public ManDecorator(Human human) {
    this.human = human;
  }

  public void act() {
    human.act();
  }
}

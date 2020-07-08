package com.learn.patterns.structural.trainings.decorator;

/**
 * Created by dmitry on 25.01.17.
 */
public class HockeyPlayerDecorator extends ManDecorator {

  public HockeyPlayerDecorator(Human human) {
    super(human);
    human.act();
  }

  @Override
  public void act() {
    System.out.println("I can act hockey");
    super.act();
  }
}

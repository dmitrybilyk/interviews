package com.learn.patterns.structural.trainings.decorator;

/**
 * Created by dmitry on 25.01.17.
 */
public class SoccerPlayerDecorator extends ManDecorator {

  public SoccerPlayerDecorator(Human human) {
    super(human);
  }

  @Override
  public void act() {
    System.out.println("I can act football");
    super.act();
  }
}

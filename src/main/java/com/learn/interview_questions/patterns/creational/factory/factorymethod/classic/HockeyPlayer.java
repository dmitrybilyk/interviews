package com.learn.interview_questions.patterns.creational.factory.factorymethod.classic;

/**
 * Created by dmitry on 06.02.17.
 */
public class HockeyPlayer extends Player {
  @Override
  public void play() {
    super.play();
    System.out.println("I can play with shayba");
  }
}

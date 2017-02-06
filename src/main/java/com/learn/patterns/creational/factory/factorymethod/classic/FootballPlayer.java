package com.learn.patterns.creational.factory.factorymethod.classic;

/**
 * Created by dmitry on 06.02.17.
 */
public class FootballPlayer extends Player {
  @Override
  public void play() {
    super.play();
    System.out.println("I can play with ball");
  }
}

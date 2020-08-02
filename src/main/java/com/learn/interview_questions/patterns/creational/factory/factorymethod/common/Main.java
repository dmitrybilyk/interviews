package com.learn.interview_questions.patterns.creational.factory.factorymethod.common;

/**
 * Created by dmitry on 06.02.17.
 */
public class Main {
  public static void main(String[] args) {
    Player player = PlayerFactory.createPlayer("ffdf");
    player.play();
    player = PlayerFactory.createPlayer("foot");
    player.play();
  }
}

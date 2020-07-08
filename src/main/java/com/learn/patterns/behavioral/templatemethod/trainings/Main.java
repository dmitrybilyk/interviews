package com.learn.patterns.behavioral.templatemethod.trainings;

/**
 * Created by dmitry on 24.03.17.
 */
public class Main {
  public static void main(String[] args) {
    PlayerCreator footballPlayerCreator = new FootballPlayerCreator();
    footballPlayerCreator.createPlayer();
  }
}

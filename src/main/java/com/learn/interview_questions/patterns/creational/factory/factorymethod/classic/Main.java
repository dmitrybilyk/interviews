package com.learn.interview_questions.patterns.creational.factory.factorymethod.classic;

/**
 * Created by dmitry on 06.02.17.
 */
public class Main {
  public static void main(String[] args) {
    PlayerFactory playerFactory = new FootballPlayerFactory();
    Player player = playerFactory.createPlayer();
    player.play();
    playerFactory = new HockeyPlayerFactory();
    player = playerFactory.createPlayer();
    player.play();
  }
}

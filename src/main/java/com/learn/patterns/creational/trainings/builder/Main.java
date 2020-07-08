package com.learn.patterns.creational.trainings.builder;

/**
 * Created by dmitry on 15.02.17.
 */
public class Main {
  public static void main(String[] args) {
    Player quickGoalKeeper = new Player.PlayerBuilder("Dima", 35).hundredMetersSpeed(15).isGoalkeeper(true).build();
    Player goodRunnerStriker = new Player.PlayerBuilder("Ruslan", 39).tenMilesSpeed(30000).isGoalkeeper(false).build();
    System.out.println(quickGoalKeeper);
    System.out.println(goodRunnerStriker);
  }
}

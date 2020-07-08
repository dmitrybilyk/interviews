package com.learn.patterns.creational.trainings1.factorymethod;

/**
 * Created by dmitry on 18.02.17.
 */
public class Main {
  public static void main(String[] args) {
    PlayerFactory factory = new FootballPlayerFactory();
    Player player = factory.getPlayer("football23");
    System.out.println(player.getName());
  }
}

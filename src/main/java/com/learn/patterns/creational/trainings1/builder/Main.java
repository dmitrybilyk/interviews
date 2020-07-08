package com.learn.patterns.creational.trainings1.builder;

/**
 * Created by dmitry on 18.02.17.
 */
public class Main {
  public static void main(String[] args) {
    Player player = new Player.PlayeBuilder("dima", 35).skill("some skill").weight(89).build();
    System.out.println(player);
  }
}

package com.learn.patterns.structural.exam.flyweight;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    PlayerFlyweight flyweight = new PlayerFlyweight();
    Player player = flyweight.getColorfulPlayer("red");
    System.out.println(player);
    player = flyweight.getColorfulPlayer("red");
    System.out.println(player);
    player = flyweight.getColorfulPlayer("blue");
    System.out.println(player);
  }
}

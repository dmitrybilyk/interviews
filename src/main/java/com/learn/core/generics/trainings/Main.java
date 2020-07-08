package com.learn.core.generics.trainings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 11.02.17.
 */
@SuppressWarnings("unchecked")
public class Main {
  public static void main(String[] args) {
    Player player = new Player();
    player.setNumber(10);
    Team team = new Team();
    team.printPlayerInfo(player);
//    Player[] players = new Player[5];
    Player[] players = {new Player(), new Player()};
    for (Player player1 : players) {
      System.out.println(player1.getNumber());
    }
    List list = new ArrayList();
    list.add("dfdf");
  }
}

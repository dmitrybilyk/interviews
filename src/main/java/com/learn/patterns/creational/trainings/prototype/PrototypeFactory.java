package com.learn.patterns.creational.trainings.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 09.02.17.
 */
public class PrototypeFactory {
  private static Map<String, PlayerPrototype> prototypeMap = new HashMap<>();

  public static PlayerPrototype getPlayer(String player) throws CloneNotSupportedException {
    PlayerPrototype prototype = prototypeMap.get(player);
    return (PlayerPrototype) prototype.clone();
  }

  public static void loadCashe() {
    PlayerPrototype footballPlayer = new FootballPlayer("Dima", 35);
    footballPlayer.setPlayer("footballPlayer");
    prototypeMap.put(footballPlayer.getPlayer(), footballPlayer);
    PlayerPrototype hockeyPlayer = new HockeyPlayer("Ruslan", 39);
    hockeyPlayer.setPlayer("hockeyPlayer");
    prototypeMap.put(hockeyPlayer.getPlayer(), hockeyPlayer);
  }

}

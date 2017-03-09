package com.learn.patterns.structural.exam.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 09.03.17.
 */
public class PlayerFlyweight {
  private Map<String, Player> stringPlayerMap = new HashMap<>();
  public Player getColorfulPlayer(String color) {
    Player player = stringPlayerMap.get(color);
    if(player == null) {
      player = new Player();
      player.setColor(color);
      stringPlayerMap.put(color, player);
    }
    return player;
  }
}

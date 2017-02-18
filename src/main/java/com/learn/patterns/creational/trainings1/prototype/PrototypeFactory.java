package com.learn.patterns.creational.trainings1.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 18.02.17.
 */
public class PrototypeFactory {
  private static Map<String, PlayerPrototype> playerPrototypeMap = new HashMap<>();

  public static PlayerPrototype getPlayerPrototype(String name) throws CloneNotSupportedException {
    PlayerPrototype playerPrototype = playerPrototypeMap.get(name);
    if (playerPrototype == null) {
      PlayerPrototype prototype = new PlayerPrototype();
      prototype.setName(name);
      playerPrototypeMap.put(name, prototype);
      return prototype;
    } else {
      return (PlayerPrototype) playerPrototype.clone();
    }
  }
}

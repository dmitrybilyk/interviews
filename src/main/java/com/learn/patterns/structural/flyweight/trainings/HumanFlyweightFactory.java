package com.learn.patterns.structural.flyweight.trainings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 08.03.17.
 */
public class HumanFlyweightFactory {
  private Map<String, Human> humanMap = new HashMap<>();
  public Human getHumanWithSomeRace(String race) {
    Human human = humanMap.get(race);
    if (human == null) {
      human = new Human();
      human.setRace(race);
      humanMap.put(human.getRace(), human);
    }
    return human;
  }
}

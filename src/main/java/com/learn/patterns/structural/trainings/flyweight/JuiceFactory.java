package com.learn.patterns.structural.trainings.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry on 31.01.17.
 */
public class JuiceFactory {
  private Map<String, Juice> juiceMap = new HashMap<>();
  public Juice getJuice(String ingredient) {
    Juice juice = juiceMap.get(ingredient);
    if (juice == null) {
      juice = new ConcreteFlyweightJuice(ingredient);
      juiceMap.put(ingredient, juice);
    }
    return juice;
  }

  public int getNumberOfJuices() {
    return juiceMap.size();
  }
}

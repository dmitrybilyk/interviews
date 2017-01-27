package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public class SushiClassHouse extends SushiHouse {
  public SushiClassHouse(Cook cook) {
    super(cook);
  }

  @Override
  public Pizza prepareSushiPizza() {
    return cook.cookPizza();
  }
}

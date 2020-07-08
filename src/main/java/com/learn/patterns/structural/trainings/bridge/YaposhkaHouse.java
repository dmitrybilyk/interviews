package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public class YaposhkaHouse extends PizzaHouse {
  public YaposhkaHouse(Cook cook) {
    super(cook);
  }

  @Override
  public Pizza preparePizza() {
    return cook.cookPizza();
  }
}

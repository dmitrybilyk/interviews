package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public class PizzaSmileHouse extends PizzaHouse {
  public PizzaSmileHouse(Cook cook) {
    super(cook);
  }

  @Override
  public Pizza preparePizza() {
    return cook.cookPizza();
  }
}

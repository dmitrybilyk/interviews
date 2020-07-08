package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public abstract class PizzaHouse {
  protected Cook cook;

  public PizzaHouse(Cook cook) {
    this.cook = cook;
  }

  public abstract Pizza preparePizza();
}

package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public abstract class SushiHouse {
  protected Cook cook;

  public SushiHouse(Cook cook) {
    this.cook = cook;
  }

  public abstract Pizza prepareSushiPizza();
}

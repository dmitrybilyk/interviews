package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public class ItalianCook extends Cook{
  @Override
  public Pizza cookPizza() {
    return new ItalianPizza();
  }
}

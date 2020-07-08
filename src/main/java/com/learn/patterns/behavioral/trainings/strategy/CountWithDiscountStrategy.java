package com.learn.patterns.behavioral.trainings.strategy;

/**
 * Created by dmitry on 16.01.17.
 */
public class CountWithDiscountStrategy implements CountSumStrategy{
  @Override
  public int count() {
    return 50;
  }
}

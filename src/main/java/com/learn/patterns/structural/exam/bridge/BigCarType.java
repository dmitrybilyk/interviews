package com.learn.patterns.structural.exam.bridge;

/**
 * Created by dmitry on 09.03.17.
 */
public class BigCarType extends CarType {
  @Override
  public void applyType() {
    System.out.println("This car will be big");
  }
}

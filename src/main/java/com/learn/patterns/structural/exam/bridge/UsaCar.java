package com.learn.patterns.structural.exam.bridge;

/**
 * Created by dmitry on 09.03.17.
 */
public class UsaCar extends Car {
  public UsaCar(CarType carType, String name) {
    super(carType, name);
  }

  @Override
  protected void applyType() {
    System.out.println("USA car is handled");
    super.applyType();
  }
}

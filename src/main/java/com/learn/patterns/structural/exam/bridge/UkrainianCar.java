package com.learn.patterns.structural.exam.bridge;

/**
 * Created by dmitry on 09.03.17.
 */
public class UkrainianCar extends Car {
  public UkrainianCar(CarType carType, String name) {
    super(carType, name);
  }

  @Override
  protected void applyType() {
    System.out.println("Ukrainian car is handled");
    super.applyType();
  }
}

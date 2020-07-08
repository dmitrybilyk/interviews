package com.learn.patterns.structural.exam.bridge;

/**
 * Created by dmitry on 09.03.17.
 */
public class Car {
  private String name;
  private CarType carType;

  public Car(CarType carType, String name) {
    this.carType = carType;
    this.name = name;
  }

  protected void applyType() {
    carType.applyType();
  }
}

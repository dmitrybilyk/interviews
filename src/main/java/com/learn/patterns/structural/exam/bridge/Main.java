package com.learn.patterns.structural.exam.bridge;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Car ukrainianCar = new UkrainianCar(new BigCarType(), "frsdf");
    ukrainianCar.applyType();
    Car usaCar = new UsaCar(new SmallCarType(), "fdf");
    usaCar.applyType();
  }
}

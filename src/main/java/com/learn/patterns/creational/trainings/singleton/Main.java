package com.learn.patterns.creational.trainings.singleton;

/**
 * Created by dmitry on 16.02.17.
 */
public class Main {
  public static void main(String[] args) {
    TrainingSingleton a = TrainingSingleton.getInstance();
    System.out.println(a);
    TrainingSingleton b = TrainingSingleton.getInstance();
    System.out.println(b);
  }
}

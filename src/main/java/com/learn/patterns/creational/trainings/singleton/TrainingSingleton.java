package com.learn.patterns.creational.trainings.singleton;

/**
 * Created by dmitry on 16.02.17.
 */
public class TrainingSingleton {
  private static TrainingSingleton instance;

  private TrainingSingleton() {
  }

  public static TrainingSingleton getInstance() {
    if (instance == null) {
      synchronized (TrainingSingleton.class) {
        if (instance == null) {
          instance =  new TrainingSingleton();
        }
      }
    }
    return instance;
  }
}

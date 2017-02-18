package com.learn.patterns.creational.trainings1.singleton;

/**
 * Created by dmitry on 18.02.17.
 */
public class MySingleton {
  private static MySingleton instance;

  private MySingleton() {
  }

  public static MySingleton getInstance() {
    if (instance == null) {
      synchronized (MySingleton.class) {
        if (instance == null) {
          instance = new MySingleton();
        }
      }
    }
    return instance;
  }
}

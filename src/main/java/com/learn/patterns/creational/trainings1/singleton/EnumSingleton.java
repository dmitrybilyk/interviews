package com.learn.patterns.creational.trainings1.singleton;

/**
 * Created by dmitry on 18.02.17.
 */
public enum EnumSingleton {
  SINGLETON;

  private String name;

  EnumSingleton() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  EnumSingleton(String name) {
    this.name = name;
  }
}

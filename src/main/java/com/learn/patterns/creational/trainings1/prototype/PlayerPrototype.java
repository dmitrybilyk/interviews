package com.learn.patterns.creational.trainings1.prototype;

/**
 * Created by dmitry on 18.02.17.
 */
public class PlayerPrototype implements Cloneable{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  @Override
  protected Object clone() throws CloneNotSupportedException {
    System.out.println("Object is created");
    return super.clone();
  }
}

package com.learn.core.generics.trainings;

/**
 * Created by dmitry on 11.02.17.
 */
public class Player {
  private String name;
  private int age;
  private int number;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String info() {
    return name + " " + age + " " + number;
  }
}

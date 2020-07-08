package com.learn.patterns.creational.trainings.prototype;

/**
 * Created by dmitry on 09.02.17.
 */
public abstract class PlayerPrototype implements Cloneable {
  private String player;

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  private String name;
  private int age;

  public PlayerPrototype(String name, int age) {
    this.name = name;
    this.age = age;
  }

  protected abstract String getAbility();

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

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return player;
  }
}

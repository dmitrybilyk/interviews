package com.learn.core.generics.trainings;

/**
 * Created by dmitry on 11.02.17.
 */
public class Team {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public<T extends Player> void printPlayerInfo(T t) {
    System.out.println(t.info());
  }
}

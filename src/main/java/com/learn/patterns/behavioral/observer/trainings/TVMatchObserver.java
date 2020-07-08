package com.learn.patterns.behavioral.observer.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class TVMatchObserver implements MatchObserver {
  private String name;

  public TVMatchObserver(String name) {
    this.name = name;
  }

  @Override
  public void getUpdate(String info) {
    System.out.println(name + " received " + name);
  }
}

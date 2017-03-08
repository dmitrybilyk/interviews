package com.learn.patterns.structural.proxy.trainings;

/**
 * Created by dmitry on 08.03.17.
 */
public class WhiteHouseWatchingImpl implements WhiteHouseWatching {
  @Override
  public void watch(String name) {
    System.out.println(name + " - you are allowed to watch, come in");
  }
}

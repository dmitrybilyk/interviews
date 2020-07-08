package com.learn.patterns.structural.proxy.trainings;

/**
 * Created by dmitry on 08.03.17.
 */
public class WhiteHouseWatchingProxy implements WhiteHouseWatching {
  private WhiteHouseWatching whiteHouseWatching;
  @Override
  public void watch(String name) {
    if (name.contains("dima")) {
      if (whiteHouseWatching == null) {
        whiteHouseWatching = new WhiteHouseWatchingImpl();
      }
      whiteHouseWatching.watch(name);
    } else {
      System.out.println("go away");
    }
  }
}

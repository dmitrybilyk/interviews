package com.learn.patterns.structural.proxy.trainings;

/**
 * Created by dmitry on 08.03.17.
 */
public class Main {
  public static void main(String[] args) {
    WhiteHouseWatching whiteHouseWatching = new WhiteHouseWatchingProxy();
//    whiteHouseWatching.watch("ruslan");
    whiteHouseWatching.watch("ruslandima");
  }
}

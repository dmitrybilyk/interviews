package com.learn.patterns.creational.trainings1.prototype;

/**
 * Created by dmitry on 18.02.17.
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    PlayerPrototype dima = PrototypeFactory.getPlayerPrototype("dima");
    PlayerPrototype dima2 = PrototypeFactory.getPlayerPrototype("dima");
    System.out.println(dima);
    System.out.println(dima2);
  }
}

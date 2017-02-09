package com.learn.patterns.creational.trainings.prototype;

/**
 * Created by dmitry on 09.02.17.
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
      PrototypeFactory.loadCashe();
    System.out.println(PrototypeFactory.getPlayer("hockeyPlayer").clone().toString());
    System.out.println(PrototypeFactory.getPlayer("hockeyPlayer").clone().toString());
    System.out.println(PrototypeFactory.getPlayer("footballPlayer").clone().toString());
  }
}

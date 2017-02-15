package com.learn.patterns.creational.trainings.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 09.02.17.
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
      PrototypeFactory.loadCashe();
    List<String> list = new ArrayList<>();
    System.out.println(PrototypeFactory.getPlayer("hockeyPlayer").clone().toString());
    System.out.println(PrototypeFactory.getPlayer("hockeyPlayer").clone().toString());
    System.out.println(PrototypeFactory.getPlayer("footballPlayer").clone().toString());
  }
}

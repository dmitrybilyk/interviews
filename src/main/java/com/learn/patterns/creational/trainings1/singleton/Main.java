package com.learn.patterns.creational.trainings1.singleton;

/**
 * Created by dmitry on 18.02.17.
 */
public class Main {
  public static void main(String[] args) {
    MySingleton a = MySingleton.getInstance();
    System.out.println(a);
    MySingleton b = MySingleton.getInstance();
    System.out.println(b);

    EnumSingleton e1 = EnumSingleton.SINGLETON;
    EnumSingleton e2 = EnumSingleton.SINGLETON;
    System.out.println(e1);
    System.out.println(e2);
  }
}

package com.learn.patterns.structural.exam.facade;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    ByShoesFacade facade = new ByShoesFacade();
    facade.byShoes("supe");
  }
}

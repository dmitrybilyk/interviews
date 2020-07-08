package com.learn.patterns.structural.exam.adapter;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    String someString = "10";
    SomeHandlerAdapter handler = new SomeHandlerAdapter();
    handler.handleSomething(someString);
  }
}

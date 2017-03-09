package com.learn.patterns.structural.exam.adapter;

/**
 * Created by dmitry on 09.03.17.
 */
public class SomeHandlerAdapter extends SomeHandler{
  public void handleSomething(String someString) {
    super.handleSomething(Integer.valueOf(someString));
  }
}

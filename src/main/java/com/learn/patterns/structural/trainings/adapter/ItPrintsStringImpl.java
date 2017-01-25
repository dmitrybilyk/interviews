package com.learn.patterns.structural.trainings.adapter;

/**
 * Created by dmitry on 25.01.17.
 */
public class ItPrintsStringImpl implements ItPrintsString {
  @Override
  public void print(String s) {
    System.out.println(s);
  }
}

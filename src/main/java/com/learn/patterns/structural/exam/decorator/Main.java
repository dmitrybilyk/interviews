package com.learn.patterns.structural.exam.decorator;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Yatch yatch = new LuxuryYatchDecorator(new SpeedyYatchDecorator(new Yatch()));
    yatch.go();
  }
}

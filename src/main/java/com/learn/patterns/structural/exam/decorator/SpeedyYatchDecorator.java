package com.learn.patterns.structural.exam.decorator;

/**
 * Created by dmitry on 09.03.17.
 */
public class SpeedyYatchDecorator extends YatchDecorator {
  public SpeedyYatchDecorator(Yatch yatch) {
    super(yatch);
  }

  @Override
  public void go() {
    System.out.println("I'm very fast");
    yatch.go();
  }
}

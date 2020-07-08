package com.learn.patterns.structural.exam.decorator;

/**
 * Created by dmitry on 09.03.17.
 */
public class LuxuryYatchDecorator extends YatchDecorator {
  public LuxuryYatchDecorator(Yatch yatch) {
    super(yatch);
  }

  @Override
  public void go() {
    System.out.println("I'm luxury");
    yatch.go();
  }
}

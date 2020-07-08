package com.learn.patterns.structural.exam.decorator;

/**
 * Created by dmitry on 09.03.17.
 */
public class YatchDecorator extends Yatch {
  protected Yatch yatch;

  public YatchDecorator(Yatch yatch) {
    this.yatch = yatch;
  }

  @Override
  public void go() {
    System.out.println("I'm adding new feature");
    super.go();
  }
}

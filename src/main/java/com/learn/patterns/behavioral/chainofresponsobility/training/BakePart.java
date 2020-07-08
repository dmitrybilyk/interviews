package com.learn.patterns.behavioral.chainofresponsobility.training;

/**
 * Created by dmitry on 17.03.17.
 */
public abstract class BakePart {
  protected BakePart nextPart;
  public void setNextPart(BakePart nextPart) {
    this.nextPart = nextPart;
  }
  public void perform(Bread bread) {
    handle(bread);
    if (nextPart != null) {
      nextPart.perform(bread);
    }
  }
  public  abstract void handle(Bread bread);
}

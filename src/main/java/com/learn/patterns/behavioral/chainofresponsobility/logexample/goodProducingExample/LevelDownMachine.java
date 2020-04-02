package com.learn.patterns.behavioral.chainofresponsobility.logexample.goodProducingExample;

/**
 * Created by dik81 on 12/14/14.
 */
public class LevelDownMachine extends AbstractMachine {
  @Override
  public void performAction(Good good) {
    good.setLevel(good.getLevel() - 1);
  }
}

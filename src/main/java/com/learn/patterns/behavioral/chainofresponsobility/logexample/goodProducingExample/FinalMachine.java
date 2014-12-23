package com.learn.patterns.behavioral.chainofresponsobility.logexample.goodProducingExample;

/**
 * Created by dik81 on 12/14/14.
 */
public class FinalMachine extends AbstractMachine {
  @Override
  public void performAction(Good good) {
    System.out.println("Good is ready!");
  }
}

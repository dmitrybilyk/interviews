package com.learn.patterns.behavioral.command.mobilephonescommand.receiver;

/**
 * Created by dmitry on 30.05.15.
 */
public class USAPhonesProducer implements PhonesProducer {
  @Override
  public void produceThePhone() {
    System.out.println("Producing the USA phone");
  }

  @Override
  public void testThePhone() {
    System.out.println("Testing the USA phone");
  }
}

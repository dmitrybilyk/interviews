package com.learn.patterns.behavioral.command.mobilephonescommand.receiver;

/**
 * Created by dmitry on 30.05.15.
 */
public class ChinesePhonesProducer implements PhonesProducer {
  @Override
  public void produceThePhone() {
    System.out.println("Producing the chinese phone");
  }

  @Override
  public void testThePhone() {
    System.out.println("Testing the chinese phone");
  }
}

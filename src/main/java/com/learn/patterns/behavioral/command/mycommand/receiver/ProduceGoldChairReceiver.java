package com.learn.patterns.behavioral.command.mycommand.receiver;

/**
 * Created by dmitry on 30.05.15.
 */
public class ProduceGoldChairReceiver implements ReceiverFactory {
  @Override
  public void produce() {
    System.out.println("Producing the gold table");
  }
}

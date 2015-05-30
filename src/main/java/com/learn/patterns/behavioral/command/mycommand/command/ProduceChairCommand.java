package com.learn.patterns.behavioral.command.mycommand.command;

import com.learn.patterns.behavioral.command.mycommand.receiver.ReceiverFactory;

/**
 * Created by dmitry on 30.05.15.
 */
public class ProduceChairCommand implements Command {
  ReceiverFactory receiverFactory;

  public ProduceChairCommand(ReceiverFactory receiverFactory) {
    this.receiverFactory = receiverFactory;
  }

  @Override
  public void execute() {
    receiverFactory.produce();
  }
}

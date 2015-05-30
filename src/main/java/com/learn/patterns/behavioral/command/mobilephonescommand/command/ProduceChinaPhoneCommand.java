package com.learn.patterns.behavioral.command.mobilephonescommand.command;

import com.learn.patterns.behavioral.command.mobilephonescommand.receiver.PhonesProducer;

/**
 * Created by dmitry on 30.05.15.
 */
public class ProduceChinaPhoneCommand implements Command {
  private PhonesProducer receiver;

  public ProduceChinaPhoneCommand(PhonesProducer receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.produceThePhone();
  }
}

package com.learn.patterns.behavioral.command.mobilephonescommand.invoker;

import com.learn.patterns.behavioral.command.mobilephonescommand.command.Command;

/**
 * Created by dmitry on 30.05.15.
 */
public class PhoneProducingInvoker {
  private Command command;

  public PhoneProducingInvoker(Command command) {
    this.command = command;
  }

  public void execute() {
    command.execute();
  }
}

package com.learn.patterns.behavioral.command.mycommand.invoker;

import com.learn.patterns.behavioral.command.mycommand.command.Command;
import com.learn.patterns.behavioral.command.mycommand.receiver.ReceiverFactory;

/**
 * Created by dmitry on 30.05.15.
 */
public class InvokerEnterprenuir {
  private Command command;

  public InvokerEnterprenuir(Command command) {
    this.command = command;
  }

  public void execute(){
    command.execute();
  }

}

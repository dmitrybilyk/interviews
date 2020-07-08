package com.learn.patterns.behavioral.command.mycommand2;

/**
 * Created by dmitry on 17.03.17.
 */
public class BakeBlackBreadCommand implements Command {
  private Receiver receiver;

  public BakeBlackBreadCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.bake();
  }
}

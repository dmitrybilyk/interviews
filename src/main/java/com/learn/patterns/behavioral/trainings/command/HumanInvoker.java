package com.learn.patterns.behavioral.trainings.command;

/**
 * Created by dmitry on 16.01.17.
 */
public class HumanInvoker {
  private Command command;

  public HumanInvoker(Command command) {
    this.command = command;
  }

  void askForOpening() {
    command.execute();
  }
}

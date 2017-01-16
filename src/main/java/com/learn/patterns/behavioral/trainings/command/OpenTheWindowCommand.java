package com.learn.patterns.behavioral.trainings.command;

/**
 * Created by dmitry on 16.01.17.
 */
public class OpenTheWindowCommand implements Command {
  private HumanReceiver human;

  public OpenTheWindowCommand(HumanReceiver human) {
    this.human = human;
  }

  @Override
  public void execute() {
    human.openTheWindow();
  }
}

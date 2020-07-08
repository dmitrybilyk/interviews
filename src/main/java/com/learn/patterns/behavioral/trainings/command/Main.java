package com.learn.patterns.behavioral.trainings.command;

/**
 * Created by dmitry on 16.01.17.
 */
public class Main {
  public static void main(String[] args) {
    HumanInvoker invoker = new HumanInvoker(new OpenTheDoorCommand(new HumanReceiver()));
    invoker.askForOpening();
  }
}

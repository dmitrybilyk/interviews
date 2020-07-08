package com.learn.patterns.behavioral.mediator.training;

/**
 * Created by dmitry on 22.03.17.
 */
public class User {
  private String name;

  public User(String dima) {
    this.name = dima;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sendMessage(String message) {
    System.out.println(name + " is sending a message - "  + message);
  }

  public void receiveMessage(String message) {
    System.out.println(name + " is receiving a message - "  + message);
  }
}

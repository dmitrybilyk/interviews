package com.learn.patterns.behavioral.mediator.training;

/**
 * Created by dmitry on 22.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Mediator mediator = new MediatorImpl() ;
    User dima = new User("Dima");
    mediator.addUser(dima);
    mediator.addUser(new User("Dima2"));
    mediator.addUser(new User("Dima3"));
    mediator.sendMessage(dima, "some message");
  }
}

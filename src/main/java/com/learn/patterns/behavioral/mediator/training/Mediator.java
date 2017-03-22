package com.learn.patterns.behavioral.mediator.training;

/**
 * Created by dmitry on 22.03.17.
 */
public interface Mediator {
  void addUser(User user);
  void sendMessage(User dima, String message);
}

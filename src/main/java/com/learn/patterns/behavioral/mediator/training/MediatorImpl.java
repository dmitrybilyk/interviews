package com.learn.patterns.behavioral.mediator.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 22.03.17.
 */
public class MediatorImpl implements Mediator{
  private List<User> users = new ArrayList<>();
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void sendMessage(User sentUser, String message) {
    for (User user : users) {
      if (!user.equals(sentUser)) {
        user.receiveMessage(message);
      }
    }
  }

}

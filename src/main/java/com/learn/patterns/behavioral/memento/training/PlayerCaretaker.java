package com.learn.patterns.behavioral.memento.training;

/**
 * Created by dmitry on 22.03.17.
 */
public class PlayerCaretaker {
  private Object object;
  public void save(PlayerOriginator playerOriginator) {
    object = playerOriginator.save();
  }
  public void updateToPreviousState(PlayerOriginator playerOriginator) {
    playerOriginator.updateToPreviousState(object);
  }
}

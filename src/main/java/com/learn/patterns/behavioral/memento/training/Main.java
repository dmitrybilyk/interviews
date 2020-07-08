package com.learn.patterns.behavioral.memento.training;

/**
 * Created by dmitry on 22.03.17.
 */
public class Main {
  public static void main(String[] args) {
    PlayerOriginator playerOriginator = new PlayerOriginator();
    playerOriginator.setName("Some name");
    playerOriginator.setBiograthy("some biograthy");

    PlayerCaretaker playerCaretaker = new PlayerCaretaker();
    playerCaretaker.save(playerOriginator);
    playerOriginator.setName("new name");
    System.out.println(playerOriginator.getName());

    playerCaretaker.updateToPreviousState(playerOriginator);

    System.out.println(playerOriginator.getName());
  }
}

package com.learn.patterns.structural.decorator.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class QuickPlayer extends PlayerDecorator {
  public QuickPlayer(Player player) {
    super(player);
  }

  @Override
  public void play() {
    player.play();
    System.out.println("I'm a quick player");
  }
}

package com.learn.patterns.structural.decorator.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class PlayerDecorator extends Player {
  protected Player player;

  public PlayerDecorator(Player player) {
    this.player = player;
  }

  @Override
  public void play() {
    player.play();
  }
}

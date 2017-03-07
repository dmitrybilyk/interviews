package com.learn.patterns.structural.decorator.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Player quickPlayer = new PlayerDecorator(new SmartPlayer(new QuickPlayer(new Player())));
    quickPlayer.play();
  }
}

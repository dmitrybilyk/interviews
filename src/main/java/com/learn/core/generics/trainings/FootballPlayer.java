package com.learn.core.generics.trainings;

/**
 * Created by dmitry on 11.02.17.
 */
@SuppressWarnings("dfd")
public class FootballPlayer extends Player{
  @Override
  public String info() {
    return super.info() + " " + "I also can kick the ball";
  }
}

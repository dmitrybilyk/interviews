package com.learn.patterns.structural.trainings.decorator;

/**
 * Created by dmitry on 25.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Human dima = new Man();
    dima.act();
    dima = new SoccerPlayerDecorator(new Man());
    dima.act();
  }
}

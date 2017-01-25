package com.learn.patterns.structural.trainings.adapter.sizeadapter;

/**
 * Created by dmitry on 25.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Ball ball = new Ball();
    BallColorAdapter ballColorAdapter = new BallColorAdapter();
    ball.setColor(ballColorAdapter.getYellowBlackColor());
    System.out.println(ball.getColor());

    BallColorInheritanceAdapter ballColorInheritanceAdapter = new BallColorInheritanceAdapter();
    System.out.println(ballColorInheritanceAdapter.getYellowBlackColor());

  }
}

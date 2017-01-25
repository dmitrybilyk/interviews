package com.learn.patterns.structural.trainings.adapter.sizeadapter;

/**
 * Created by dmitry on 25.01.17.
 */
public class BallColorAdapter {
  public String getYellowBlackColor() {
    BallColorProducer ballColorProducer = new BallColorProducer();
    return "yellow-" + ballColorProducer.color();
  }
}

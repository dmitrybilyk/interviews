package com.learn.patterns.structural.trainings.adapter.sizeadapter;

/**
 * Created by dmitry on 25.01.17.
 */
public class BallColorInheritanceAdapter extends BallColorProducer {
  public String getYellowBlackColor() {
    return "yellow-" + color();
  }
}

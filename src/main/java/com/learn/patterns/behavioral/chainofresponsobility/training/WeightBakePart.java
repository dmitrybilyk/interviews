package com.learn.patterns.behavioral.chainofresponsobility.training;

/**
 * Created by dmitry on 17.03.17.
 */
public class WeightBakePart extends BakePart {
  @Override
  public void handle(Bread bread) {
    System.out.println("Determining the weight to " + bread.getWeight());
  }
}

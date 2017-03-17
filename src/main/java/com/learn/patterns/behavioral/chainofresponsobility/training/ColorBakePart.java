package com.learn.patterns.behavioral.chainofresponsobility.training;

/**
 * Created by dmitry on 17.03.17.
 */
public class ColorBakePart extends BakePart {
  @Override
  public void handle(Bread bread) {
    System.out.println("Coloring bread into " + bread.getColor());
  }
}

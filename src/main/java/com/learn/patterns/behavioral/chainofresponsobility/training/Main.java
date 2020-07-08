package com.learn.patterns.behavioral.chainofresponsobility.training;

/**
 * Created by dmitry on 17.03.17.
 */
public class Main {
  public static void main(String[] args) {
    BakePart startColorPart = new ColorBakePart();
    BakePart weightPart = new WeightBakePart();
    BakePart formPart = new FormBakePart();
    startColorPart.setNextPart(weightPart);
    weightPart.setNextPart(formPart);
    Bread bread = new Bread();
    bread.setColor("White");
    bread.setForm("Oval");
    bread.setWeight(200);

    startColorPart.perform(bread);

  }
}

package com.learn.patterns.behavioral.trainings.strategy;

/**
 * Created by dmitry on 16.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    context.setCountSumStrategy(new CountFullSumStrategy());
    System.out.println(context.executeCount());

    context.setCountSumStrategy(new CountWithDiscountStrategy());
    System.out.println(context.executeCount());
  }
}

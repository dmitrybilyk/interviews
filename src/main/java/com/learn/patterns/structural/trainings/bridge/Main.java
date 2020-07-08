package com.learn.patterns.structural.trainings.bridge;

/**
 * Created by dmitry on 27.01.17.
 */
public class Main {
  public static void main(String[] args) {
//    PizzaHouse pizzaSmileHouse = new PizzaSmileHouse(new ItalianCook());
//    System.out.println(pizzaSmileHouse.preparePizza().getName());
//    PizzaHouse italianHouse = new PizzaSmileHouse(new JapaneseCook());
//    System.out.println(italianHouse.preparePizza().getName());
    SushiHouse ukrPizzaFromSushiHouseByJapaneseCook = new SushiClassHouse(new JapaneseCook());
    System.out.println(ukrPizzaFromSushiHouseByJapaneseCook.prepareSushiPizza().getName());
  }
}

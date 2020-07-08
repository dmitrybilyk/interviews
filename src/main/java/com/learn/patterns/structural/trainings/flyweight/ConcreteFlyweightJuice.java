package com.learn.patterns.structural.trainings.flyweight;

/**
 * Created by dmitry on 31.01.17.
 */
public class ConcreteFlyweightJuice implements Juice {
  //intristic property
  private String ingredient;

  public ConcreteFlyweightJuice(String ingredient) {
    this.ingredient = ingredient;
  }

  @Override
  public void serveJuice(Client client) {
    System.out.println(ingredient + " juice for client number " + client.getClientNumber() + " is prepared");
  }
}

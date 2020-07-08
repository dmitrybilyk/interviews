package com.learn.patterns.structural.trainings.flyweight;

/**
 * Created by dmitry on 31.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Client client1 = new Client(1);
    JuiceFactory juiceFactory = new JuiceFactory();
    Juice juice1 = juiceFactory.getJuice("Banana");
    juice1.serveJuice(client1);
    Client client2 = new Client(2);
    Juice juice2 = juiceFactory.getJuice("Banana");
    juice2.serveJuice(client2);
    Client client3 = new Client(3);
    Juice juice3 = juiceFactory.getJuice("Orange");
    juice3.serveJuice(client3);
    System.out.println(juiceFactory.getNumberOfJuices());
  }
}

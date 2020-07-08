package com.learn.patterns.structural.trainings.flyweight;

/**
 * Created by dmitry on 31.01.17.
 */
public class Client {
  private int clientNumber;

  public Client(int clientNumber) {
    this.clientNumber = clientNumber;
  }

  public int getClientNumber() {
    return clientNumber;
  }

  public void setClientNumber(int clientNumber) {
    this.clientNumber = clientNumber;
  }
}

package com.learn.patterns.behavioral.iterator.trainings;

/**
 * Created by dmitry on 21.03.17.
 */
public class Bag {
  private String name;
  private BAG_TYPE bagType;
  public enum BAG_TYPE {
    BIG_BAG, SMALL_BAG
  }

  public Bag(String name, BAG_TYPE bagType) {
    this.name = name;
    this.bagType = bagType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BAG_TYPE getBagType() {
    return bagType;
  }

  public void setBagType(BAG_TYPE bagType) {
    this.bagType = bagType;
  }
}

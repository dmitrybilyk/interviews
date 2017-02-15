package com.learn.core.collections.Collection.List.ArrayList.hotel;

/**
 * Created by dmitry on 11.02.17.
 */
public class HotelHandler<T extends Hotel> {
  private T t;

  public HotelHandler(T hotel) {
    this.t = hotel;
  }

  public void printInfo() {
    t.printName();
  }


}

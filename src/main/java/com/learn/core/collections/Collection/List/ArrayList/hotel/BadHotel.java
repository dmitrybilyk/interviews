package com.learn.core.collections.Collection.List.ArrayList.hotel;

/**
 * Created by dmitry on 11.02.17.
 */
public class BadHotel extends Hotel {
  public BadHotel() {
    name = "bad name";
  }
  protected void printName(){
    System.out.println("some bad hotel logic");
    System.out.println(name);
  }
}

package com.learn.core.collections.Collection.List.ArrayList.hotel;

/**
 * Created by dmitry on 11.02.17.
 */
public class Main {
  public static void main(String[] args) {
//    Hotel hotel = new BadHotel();
//    hotel.printName();
    HotelHandler hotelHandler = new HotelHandler<Hotel>(new GoodHotel());
    hotelHandler.printInfo();
  }
}

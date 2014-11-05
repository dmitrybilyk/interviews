package com.learn.core.generics.toUnderstand.boundedTypeVariables;

import com.learn.core.generics.toUnderstand.model.Apple;
import com.learn.core.generics.toUnderstand.model.Juice;
import com.learn.core.generics.toUnderstand.model.Juicy;
import com.learn.core.generics.toUnderstand.model.Strawberry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 10/25/14.
 */
public class Main {
  public static void main(String[] args) {
    Apple apple = new Apple();
    ArrayList<Juicy<Apple>> fruits = new ArrayList<Juicy<Apple>>();
    fruits.add(new Apple());
//    fruits.add(new Strawberry());
    List<Juice<Apple>> juiceList = apple.squeeze(fruits);

  }
}

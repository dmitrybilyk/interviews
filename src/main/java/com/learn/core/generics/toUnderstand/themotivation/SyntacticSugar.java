package com.learn.core.generics.toUnderstand.themotivation;

import com.learn.core.generics.toUnderstand.model.Apple;
import com.learn.core.generics.toUnderstand.model.Strawberry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 10/24/14.
 */
public class SyntacticSugar {
  //Avoid casting, type checking at compile time
  public static void main(String[] args) {
    List<Apple> appleList = new ArrayList<Apple>();
//    appleList.add(new Strawberry()); // cannot be applied (strawberry to apple)
    appleList.add(new Apple());
    appleList.add(new Apple());
    appleList.add(new Apple());

    Apple apple = appleList.get(1);
    System.out.println(apple);
  }
}

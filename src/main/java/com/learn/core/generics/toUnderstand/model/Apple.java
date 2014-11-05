package com.learn.core.generics.toUnderstand.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 10/24/14.
 */
public class Apple extends Fruit implements Juicy{
  @Override
  public List<Juice<Apple>> squeeze(List fruits) {
    return new ArrayList<Juice<Apple>>();
  }
}

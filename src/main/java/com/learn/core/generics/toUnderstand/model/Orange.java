package com.learn.core.generics.toUnderstand.model;

import java.util.List;

/**
 * Created by dik81 on 10/25/14.
 */
public class Orange extends Fruit implements Juicy<Orange> {
  @Override
  public <T extends Juicy<T>> List<Juice<T>> squeeze(List<T> fruits) {
    return null;
  }
}

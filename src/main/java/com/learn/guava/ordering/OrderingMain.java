package com.learn.guava.ordering;

import com.google.common.collect.Ordering;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dik81 on 12/16/14.
 */
public class OrderingMain {
  public static void main(String[] args) {
//    Ordering<Comparable> NULLS_FIRST = Ordering.natural().nullsFirst();
    Ordering<Comparable> NULLS_FIRST = Ordering.natural().nullsLast();
    List<BigDecimal> bigDecimalList = new ArrayList<>();
    bigDecimalList.add(null);
//    bigDecimalList.add(BigDecimal.ONE);
//    bigDecimalList.add(BigDecimal.TEN);
//    bigDecimalList.add(BigDecimal.ZERO);

    BigDecimal max = BigDecimal.ZERO;

    for (BigDecimal bigDecimal : bigDecimalList) {
      max = NULLS_FIRST.max(max, bigDecimal);
    }
    System.out.println(max);
  }
}

package com.learn.other.other;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by dmitry on 08.04.15.
 */
public class BigDecimalRoundingMain {
  public static void main(String[] args) {
    BigDecimal first = new BigDecimal("34.22");
    BigDecimal second = new BigDecimal("4");
    BigDecimal result = first.divide(second, RoundingMode.HALF_EVEN);

    System.out.println(result);
  }
}

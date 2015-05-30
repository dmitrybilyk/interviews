package com.learn.other.other;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static java.math.RoundingMode.HALF_EVEN;
import static java.math.RoundingMode.HALF_UP;

/**
 * Created by dmitry on 08.04.15.
 */
public class BigDecimalRoundingMain {
  public static void main(String[] args) {
    BigDecimal first = new BigDecimal("52.251");

    System.out.println(round(first));
  }
  private static BigDecimal round(BigDecimal rounded) {
    if (rounded != null) {
//      MathContext mc = new MathContext(4, HALF_EVEN);
//      MathContext mc = new MathContext(4, HALF_UP);
      return rounded.setScale(1, HALF_EVEN);
//      return rounded.setScale(1, HALF_UP);
    }
    return null;
  }
}

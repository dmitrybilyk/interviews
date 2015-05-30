package com.learn.other.other;

import java.math.BigDecimal;

/**
 * Created by dmitry on 06.05.15.
 */
public class DecimalAsString {
  public static void main(String[] args) {
    BigDecimal value = new BigDecimal("23.22");
    decimalAsString(value);
  }

  public static void decimalAsString(BigDecimal value) {
    decimalAsString2(value);
  }

  public static void decimalAsString2(BigDecimal value) {
    System.out.println(value);;
  }
}

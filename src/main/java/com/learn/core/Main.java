package com.learn.core;

import java.lang.Integer;import java.lang.String;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 11/20/14.
 */
public class Main {
  private static final double MARK_NORMAL_RANGE_MAX = 1;
  private static final double MARK_NORMAL_RANGE_MIN = 5;

  public static void main(String[] args) {
//    check();
//    System.out.println("dsfsdf");
    double value = 0.456;

    int scale = 2;
    System.out.println(Math.floor(value * Math.pow(10, scale) + 0.5d) / Math.pow(10, scale));

    BigDecimal bigDecimal = new BigDecimal("0.456");
    BigDecimal bigDecimal2 = new BigDecimal("423.3");
    BigDecimal newBigDecimal = new BigDecimal("12.307").setScale(scale, RoundingMode.HALF_EVEN);
    System.out.println(newBigDecimal);
    System.out.println(bigDecimal2.doubleValue() == bigDecimal2.intValue());
    System.out.println(BigDecimal.ONE);
    System.out.println(BigDecimal.ZERO.setScale(1));

    System.out.println(toPercent(12.34567));
    System.out.println(round(new BigDecimal(172.3455555567)));
    System.out.println(BigDecimal.ZERO.setScale(1));

    System.out.println(BigDecimal.valueOf(0.0));


  }

  public static BigDecimal getRoundedValue(Number value){
    if (value != null) {
      MathContext mc = new MathContext(2, RoundingMode.HALF_EVEN);
      return new BigDecimal(value.doubleValue()).round(mc);
    }
    return null;
  }
  private static double toPercent(double value) {
    if (value >= MARK_NORMAL_RANGE_MAX) {
      double tempValue = (MARK_NORMAL_RANGE_MIN - value) * 100 / 4;
      return getRoundedValue(tempValue).doubleValue();
    }
    return 100d;
  }

  private static BigDecimal round(BigDecimal value) {
    return value.setScale(0, RoundingMode.HALF_UP);
  }


  private static void check() {

    List<String> list = new ArrayList<String>();
    List<Integer> list1 = new ArrayList<Integer>();
    list.add("222");
    list.add("2222");
    list.add("2223");
    list.add("2224");
    list.add("2225");
    list.add("2226");

    list1.add(2);
    list1.add(3);
    list1.add(5);
    list1.add(4);
    list1.add(62);
    list1.add(27);
    for (String s: list){
      for (Integer integer: list1){
        if (integer == 5){
          return;
        }
      }
    }
  }
}

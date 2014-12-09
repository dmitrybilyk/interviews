package com.learn.core.datatypes.bigdecimal;

import java.math.BigDecimal;

/**
 * Created by dik81 on 11/25/14.
 */
public class BigDecimalVsDouble {
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal(0.01d);
    BigDecimal b1d1 = BigDecimal.valueOf(0.01d);
    BigDecimal bd2 = BigDecimal.valueOf(0.01d);
    System.out.println(bd1);
    System.out.println(b1d1);
    System.out.println(bd2);
    BigDecimal bd = null;
      System.out.println(bd == null);
//    System.out.println(BigDecimal.valueOf(null));
  }


}

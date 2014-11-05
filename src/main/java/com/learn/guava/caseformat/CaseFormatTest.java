package com.learn.guava.caseformat;

import com.google.common.base.CaseFormat;

/**
 * Created by dik81 on 11/2/14.
 */
public class CaseFormatTest {
  public static void main(String[] args) {
    String result = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME"); // returns "constantName"
    System.out.println(result);
  }
}

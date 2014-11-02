package com.learn.guava.charmatcher;

import com.google.common.base.CharMatcher;
import org.apache.log4j.Logger;

/**
 * Created by dik81 on 11/2/14.
 */
public class CharMatcherTest {
  private static Logger logger = Logger.getLogger(CharMatcher.class);
  public static void main(String[] args) {
    String string = "ONEone, two, 345";
    String theDigits = com.google.common.base.CharMatcher.DIGIT.retainFrom(string);
    logger.info(theDigits);

    String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(string);
    // eliminate all characters that aren't digits or lowercase
    logger.info(lowerAndDigit);

  }
}

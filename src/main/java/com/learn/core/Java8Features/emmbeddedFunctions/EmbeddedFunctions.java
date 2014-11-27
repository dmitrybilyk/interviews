package com.learn.core.Java8Features.emmbeddedFunctions;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by dik81 on 11/26/14.
 */
public class EmbeddedFunctions {
  public static void main(String[] args) {
    Predicate<String> predicate = (s) -> s.length() > 0;

    System.out.println(predicate.test("foo"));              // true
    System.out.println(predicate.negate().test("foo"));     // false

    Predicate<Boolean> nonNull = Objects::nonNull;
    Predicate<Boolean> isNull = Objects::isNull;

    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();
  }
}

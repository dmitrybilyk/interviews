package com.learn.core.Java8Features.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dik81 on 11/26/14.
 */
public class Lambda {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 6, 2, 1, 3, 4, 5, 3, 6);

//    for (int number : numbers) {
//      System.out.println(number);
//    }
    numbers.forEach(value -> System.out.println(value));
//    numbers.forEach(System.out::println);

    System.out.println(sumAll(numbers));
    System.out.println(sumAllEven(numbers));

    Collections.sort(numbers, (Integer a, Integer b) -> b.compareTo(a));
    numbers.forEach(System.out::println);
    Collections.reverse(numbers);
    numbers.forEach(System.out::println);
  }


  public static int sumAll(List<Integer> numbers) {
    int total = 0;
    for (int number : numbers) {
      total += number;
    }
    return total;
  }

  public static int sumAllEven(List<Integer> numbers) {
    int total = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        total += number;
      }
    }
    return total;
  }

}

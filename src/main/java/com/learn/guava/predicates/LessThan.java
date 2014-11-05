package com.learn.guava.predicates;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.Arrays;
import java.util.Collection;

public class LessThan<T extends Comparable<T>> implements Predicate<T> {
  private final Comparable<T> value;

  public LessThan(final Comparable<T> value) {
    this.value = value;
  }

  @Override
  public boolean apply(final T input) {
    return value.compareTo(input) > 0;
  }


public static void main(final String[] args) {
  final Collection<Integer> things = Arrays.asList(-4, 1, 2, 3, 4, 8);
  System.out.println(Iterables.all(things, new LessThan<Integer>(5)));
}
}

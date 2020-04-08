package com.learn.core.collections.Collection.Set.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dmitry on 09.02.15.
 */
public class TestSetRemoveAll {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("four");
    System.out.println(set);

    Set<String> setToDelete = new HashSet<>();
    setToDelete.add("one");
    setToDelete.add("two");
    setToDelete.iterator().next();

    set.removeAll(setToDelete);
    System.out.println(set);
  }
}

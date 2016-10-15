package com.learn.guava.iterables;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 15.05.15.
 */
public class Main {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    for (Integer i = 0; i < 20; i++) {
      list.add(i);
    }

    for (Integer integer : list) {
      System.out.println(integer);
    }

    list = ImmutableList.copyOf(Iterables.limit(list, 3));


    for (Integer integer : list) {
      System.out.println(integer);
    }

    String s = "46";
    System.out.println("decode: " + Integer.decode(s));


  }
}

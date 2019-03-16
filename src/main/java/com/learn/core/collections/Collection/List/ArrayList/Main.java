package com.learn.core.collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by dmitry on 11.02.17.
 */
public class Main {
  public static void main(String[] args) {
    Map<String, Integer> integerMap = new HashMap<>();
    integerMap.put("key1", 10);
    integerMap.put("lena", 11);

//    System.out.println(integerMap.get("key1"));

    List<String> stringList = new ArrayList<>();
    stringList.addAll(Arrays.asList("dima", "lena"));

//    for (String ddd555 : stringList) {
//      System.out.println(ddd555);
//    }



    for (String s : integerMap.keySet()) {
      System.out.println(integerMap.get(s));
    }

  }
}



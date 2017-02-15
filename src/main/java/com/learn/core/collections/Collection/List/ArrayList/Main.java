package com.learn.core.collections.Collection.List.ArrayList;

import java.util.ArrayList;

/**
 * Created by dmitry on 11.02.17.
 */
public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("123");
    list.add("dfdf");


    for (String s : list) {
//      String s2 = s;
      System.out.println(s);
    }
//    for (Object o : list) {
//      String s = (String) o;
//      System.out.println(s);
//    }

  }
}



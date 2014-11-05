package com.learn.core.generics.toUnderstand.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 10/24/14.
 */
public class Examples {

//  Type Safety When Writing…
  public void whenWriting(){
    List<String> str = new ArrayList<String>();
    str.add("Hello ");
    str.add("World.");
//    str.add(1);
  }

//  … and When Reading
//If we pass the List<String> reference around, we’re
//  always guaranteed to retrieve a String object from it:
  public void whenReading(){
//    String myString = str.get(0);
  }

//  Iterating
//  for (Iterator<String> iter = str.iterator(); iter.hasNext();) {
//    String s = iter.next();
//    System.out.print(s);
//  }

// Using foreach

  public void forEach(){
    List<String> str = new ArrayList<String>();
//    List str = new ArrayList();
    str.add("Hello ");
    str.add("World.");

    for (String s: str){
      System.out.println(s);
    }
  }
//  for (String s: str) {
//    System.out.print(s);
//  }

//  autoboxing and autounboxing
  public void auto(){
    List<Integer> ints = new ArrayList<Integer>();
//    List ints = new ArrayList();
    ints.add(0);
    ints.add(1);

    int sum = 0;
    for (int i : ints) {
      sum += i;
    }
  }

}





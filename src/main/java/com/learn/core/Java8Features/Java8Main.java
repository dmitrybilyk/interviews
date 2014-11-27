package com.learn.core.Java8Features;

/**
 * Created by dik81 on 11/26/14.
 */
public class Java8Main {
  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("do somthing");
      }
    };
    runnable.run();


    Runnable java8Runner = () ->{
      System.out.println("I am running");
    };


  }
}

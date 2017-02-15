package com.learn.core.annotations.trainings;

/**
 * Created by dmitry on 11.02.17.
 */
public class Human {
  @InfoAnnotation(comments = "method printWord is triggered")
  public void printWord() {
    System.out.println("dfdf");
  }
}

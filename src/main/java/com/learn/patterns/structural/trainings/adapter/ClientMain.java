package com.learn.patterns.structural.trainings.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 25.01.17.
 */
public class ClientMain {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3);
    ItPrintsStringFromListAdapter itPrintsString = new ItPrintsStringAdapter();
    itPrintsString.print(integerList);

  }
}

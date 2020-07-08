package com.learn.patterns.structural.trainings.adapter;

import java.util.List;

/**
 * Created by dmitry on 25.01.17.
 */
public class ItPrintsStringAdapter implements ItPrintsStringFromListAdapter {
  @Override
  public void print(List<Integer> strings) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Integer string : strings) {
      stringBuilder.append(string);
    }
    ItPrintsString itPrintsString = new ItPrintsStringImpl();
    itPrintsString.print(stringBuilder.toString());
  }
}

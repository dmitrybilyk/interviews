package com.learn.patterns.structural.exam.proxy;

/**
 * Created by dmitry on 09.03.17.
 */
public class Main {
  public static void main(String[] args) {
    School school = new SchoolProxy(false);
    school.comingToSchool();
  }
}

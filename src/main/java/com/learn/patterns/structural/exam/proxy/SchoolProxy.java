package com.learn.patterns.structural.exam.proxy;

/**
 * Created by dmitry on 09.03.17.
 */
public class SchoolProxy extends School {
  private boolean isClean;
  public SchoolProxy(boolean isClean) {
    this.isClean = isClean;
  }
  @Override
  public void comingToSchool() {
    if(isClean) {
      super.comingToSchool();
    } else {
      System.out.println("go out)))");
    }
  }
}

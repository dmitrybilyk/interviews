package com.learn.patterns.behavioral.chainofresponsobility.logexample.goodProducingExample;

/**
 * Created by dik81 on 12/14/14.
 */
public class Good {
  private String name;
  private String color;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private int level;

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  private void paint(String color){
    setColor(this.color + "-" + color);
  }

}

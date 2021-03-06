package com.learn.patterns.behavioral.trainings.visitor;

/**
 * Created by dmitry on 16.01.17.
 */
public class TextBookComponent implements Component {
  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}

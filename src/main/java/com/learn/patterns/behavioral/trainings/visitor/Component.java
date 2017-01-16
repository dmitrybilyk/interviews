package com.learn.patterns.behavioral.trainings.visitor;

/**
 * Created by dmitry on 16.01.17.
 */
public interface Component {
  void accept(Visitor visitor);
}

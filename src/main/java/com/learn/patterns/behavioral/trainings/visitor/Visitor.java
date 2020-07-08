package com.learn.patterns.behavioral.trainings.visitor;

/**
 * Created by dmitry on 16.01.17.
 */
public interface Visitor {
  void visit(BookComponent bookComponent);
  void visit(TextBookComponent textBookComponent);
}

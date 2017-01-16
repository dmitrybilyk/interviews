package com.learn.patterns.behavioral.trainings.visitor;

/**
 * Created by dmitry on 16.01.17.
 */
public class SellVisitor implements Visitor {
  @Override
  public void visit(BookComponent bookComponent) {
    System.out.println("We are selling a lot of books");
  }

  @Override
  public void visit(TextBookComponent textBookComponent) {
    System.out.println("We are selling a lot of textbooks");
  }
}

package com.learn.patterns.behavioral.interpreter.malefemale.training;

/**
 * Created by dmitry on 21.03.17.
 */
public class Main {
  public static void main(String[] args) {
    Expression andExpression = new AndExpressionExpression(new TerminalExpression("Dima"), new TerminalExpression("Ruslan"));
    System.out.println(andExpression.interpret("DimaRuslan"));
  }
}

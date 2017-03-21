package com.learn.patterns.behavioral.interpreter.malefemale.training;

/**
 * Created by dmitry on 21.03.17.
 */
public class AndExpressionExpression implements Expression {
  private Expression expression1;
  private Expression expression2;

  public AndExpressionExpression(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  @Override
  public boolean interpret(String context) {
    return expression1.interpret(context) && expression2.interpret(context);
  }
}

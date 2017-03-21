package com.learn.patterns.behavioral.interpreter.malefemale;

public class TerminalExpression implements Expression {

   private String data;

   public TerminalExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {

      return context.contains(data);
   }
}
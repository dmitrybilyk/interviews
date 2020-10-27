package com.learn.interview_questions.java8.lambda;

public class LambdaCantChangeValueOfLocalVariableOfMethod {
  public static void main(String[] args) {

    final int n=70;
    int m=30;
    Operation op = ()->{

//      n=100;
//      - так нельзя сделать
      return m+n;
    };
    // n=100;  - так тоже нельзя
    System.out.println(op.calculate()); // 100
  }
}

interface Operation{
  int calculate();
}

package com.learn.interview_questions.patterns.behavioral.command;

public class Main {
  public static void main(String[] args) {
    Command command = new StartGameCommand(new Uefa());
    command.execute();
  }
}

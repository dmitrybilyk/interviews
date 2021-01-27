package com.learn.interview_questions.patterns.behavioral.command;

public class StartGameCommand implements Command {
  private Uefa uefa;

  public StartGameCommand(Uefa uefa) {
    this.uefa = uefa;
  }

  @Override
  public void execute() {
    uefa.startGame();
  }
}

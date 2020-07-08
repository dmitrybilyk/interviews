package com.learn.patterns.behavioral.command.mycommand2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 17.03.17.
 */
public class BakeInvoker {
  private List<Command> commands = new ArrayList<>();

  public void addCommand(Command command) {
    commands.add(command);
  }

  public void invoke() {
    for (Command command : commands) {
      command.execute();
    }
  }
}

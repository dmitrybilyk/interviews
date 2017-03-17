package com.learn.patterns.behavioral.command.mycommand2;

/**
 * Created by dmitry on 17.03.17.
 */
public class Main {
  public static void main(String[] args) {
    BakeBlackBreadCommand bakeBlackBreadCommand = new BakeBlackBreadCommand(new BakeBlackBreadReceiver());
    BakeInvoker invoker = new BakeInvoker();
    invoker.addCommand(bakeBlackBreadCommand);
    BakeBlackBreadCommand bakeBlackBreadCommand1 = new BakeBlackBreadCommand(new BakeWhiteBreadReceiver());
    invoker.addCommand(bakeBlackBreadCommand1);
    invoker.invoke();
  }
}

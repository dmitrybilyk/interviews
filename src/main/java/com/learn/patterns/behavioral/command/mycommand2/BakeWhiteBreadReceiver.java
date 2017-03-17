package com.learn.patterns.behavioral.command.mycommand2;

/**
 * Created by dmitry on 17.03.17.
 */
public class BakeWhiteBreadReceiver implements Receiver{
  @Override
  public void bake() {
    System.out.println("I'm producing the white bread");
  }
}

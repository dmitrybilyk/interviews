package com.learn.patterns.behavioral.chainofresponsobility.logexample.goodProducingExample;

/**
 * Created by dik81 on 12/14/14.
 */
public abstract class AbstractMachine {

  private AbstractMachine nextMachine;

  protected void setNextMachine(AbstractMachine abstractMachine) {
    this.nextMachine = abstractMachine;
  }

  public void handle(Good good){
    performAction(good);
    if(nextMachine !=null){
      nextMachine.handle(good);
    }
  }

  public abstract void performAction(Good good);
}

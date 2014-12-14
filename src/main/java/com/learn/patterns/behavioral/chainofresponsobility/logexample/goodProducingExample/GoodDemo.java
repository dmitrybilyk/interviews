package com.learn.patterns.behavioral.chainofresponsobility.logexample.goodProducingExample;

/**
 * Created by dik81 on 12/14/14.
 */
public class GoodDemo {
  public static void main(String[] args) {
    AbstractMachine chain = getGoodHandleChain();
    Good good = new Good();
    chain.handle(good);
    System.out.println(good.getColor());
    System.out.println(good.getLevel());
  }


  private static AbstractMachine getGoodHandleChain() {
    AbstractMachine levelUpMachine = new LevelUpMachine();
    AbstractMachine levelDownMachine = new LevelDownMachine();
    levelUpMachine.setNextMachine(levelDownMachine);
    AbstractMachine paintingMachine = new PaintingMachine();
    levelDownMachine.setNextMachine(paintingMachine);
    return levelUpMachine;
  }
}

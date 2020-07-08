package com.learn.patterns.structural.exam.facade;

/**
 * Created by dmitry on 09.03.17.
 */
public class ByShoesFacade {
  public void byShoes(String param) {
    if(param.contains("super")) {
      AtASuperMarket atASuperMarket = new AtASuperMarket();
      atASuperMarket.buyingAtAMarket();
    } else {
      AtAMarket atAMarket = new AtAMarket();
      atAMarket.buyingAtAMarket();
    }

  }
}

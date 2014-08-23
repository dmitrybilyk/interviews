package com.learn.patterns.freemanAndFreeman.headfirst.factory.pizzaaf.customabstractfactoryfactory;

/**
 * Created by bid on 8/1/14.
 */
public class ChinaCellPhoneKeyBoardFactory implements KeyboardFactory
{
   @Override
   public Keyboard createKeyboard()
   {
      return new ChinaKeyboard();
   }
}

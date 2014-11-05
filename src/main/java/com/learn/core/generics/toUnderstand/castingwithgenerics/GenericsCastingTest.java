package com.learn.core.generics.toUnderstand.castingwithgenerics;

import java.util.List;

/**
 * Created by dik81 on 11/5/14.
 */
public class GenericsCastingTest {
  public static void main(String[] args) {
//     Student student =
  }

  private class Human{
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  private class Student extends Human{

  }

//  model.<EvaluationBO>getBean().getEvalstatusEnum()

//  private <T> T getHuman(T t){
//    T t = new T();
//    return t.getName();
//  }
//
//  private <T> class HumanFactory<Human>{
//
//  }

}

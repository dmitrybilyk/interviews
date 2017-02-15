package com.learn.core.generics.tutorial1;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 10.04.13
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class TwoObjectsGeneric<T, V, L> {
  T ob1;

  V ob2;

  L ob3;

  TwoObjectsGeneric(T o1, V o2, L o3) {
    ob1 = o1;
    ob2 = o2;
    ob3 = o3;
  }

  TwoObjectsGeneric(T o1, T o2) {
    ob1 = o1;
    System.out.println(o2);
  }

  public static void main(String args[]) {
    TwoObjectsGeneric<String, String, Long> tgObj = new TwoObjectsGeneric<>("dfdf", "Generics", 10l);
    tgObj.showTypes();

    String v = tgObj.getob1();
    System.out.println("value: " + v);

    String str = tgObj.getob2();
    System.out.println("value: " + str);

    Long aLong = tgObj.getob3();
    System.out.println("value: " + aLong);

    TwoObjectsGeneric<Integer, String, Long> tgObj2 = new TwoObjectsGeneric<>(77, "Generics", 1000l);
    tgObj.showTypes();

    System.out.println(tgObj2.someMethod(45));
  }

  T getob1() {
    return ob1;
  }

  V getob2() {
    return ob2;
  }

  L getob3() {
    return ob3;
  }

  void showTypes() {
    System.out.println("Type of T is " + ob1.getClass().getName());
    System.out.println("Type of V is " + ob2.getClass().getName());
    System.out.println("Type of L is " + ob3.getClass().getName());
  }

  public T someMethod(T t) {
    System.out.println(t);
    return t;
  }
}

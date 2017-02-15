package com.learn.core.generics.understandGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * Created by dmitry on 11.02.17.
 */
public class GenericsTest {
  static class Animal {
    void feed() {
      System.out.println("Animal is fed");
    }
  }

  static class Pet extends Animal {
    void call() {
      System.out.println("Pet is called");
    }
  }

  static class Kitty extends Pet {
    void mew() {
      System.out.println("Kitten is mewed");
    }
    void call() {
      System.out.println("Pet Kitten is called");
    }
  }

  static class Doge extends Pet {
    void bark() {
      System.out.println("Doge is barked");
    }
    void call() {
      System.out.println("Pet Dog is called");
    }
  }

  public static void main(String[] args) {
    List<Pet> src = new ArrayList<>(30);
    src.add(new Kitty());
    src.add(new Doge());
    src.add(new Pet());

    List<Pet> dest = new ArrayList<Pet>(30);
    dest.add(new Kitty());
    dest.add(new Kitty());
    dest.add(new Kitty());
    copy(dest, src);
    for (Pet p : dest) {
      p.call();
    }

    List<Number> intList = new ArrayList<Number>();
    intList.add(new Integer(10));
    intList.add(new Float(10.0f));
  }


  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
    int srcSize = src.size();
    if (srcSize > dest.size())
      throw new IndexOutOfBoundsException("Source does not fit in dest");

    if (srcSize < 10 ||
            (src instanceof RandomAccess && dest instanceof RandomAccess)) {
      for (int i=0; i<srcSize; i++)
        dest.set(i, src.get(i));
    } else {
      ListIterator<? super T> di=dest.listIterator();
      ListIterator<? extends T> si=src.listIterator();
      for (int i=0; i<srcSize; i++) {
        di.next();
        di.set(si.next());
      }
    }
  }
}

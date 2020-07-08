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
//    src.add(new Doge());
//    src.add(new Pet());

    List<Pet> dest = new ArrayList<>(30);
    dest.add(new Kitty());
    dest.add(new Kitty());
    dest.add(new Kitty());
    copy(dest, src);
    for (Pet p : dest) {
      p.call();
    }


  }


  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
    int srcSize = src.size();

      for (int i=0; i<srcSize; i++)
        dest.set(i, src.get(i));
  }
}

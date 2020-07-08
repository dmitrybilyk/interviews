package com.learn.java8.lambda.defaultMethodInInterface;

/**
 * Created by dik81 on 16.11.18.
 */
public class Animal {
    private interface Dog {
        default void bark(){
            System.out.println("Baf-baf-baf!");
        }
    }
    private interface Cat {
        default void meow(){
            System.out.println("Meow-meow...");
        }
    }
    private static class MyAnimals implements Dog, Cat {
        private void myAnimalsTalk(){
            Dog.super.bark();
            Cat.super.meow();
        }
    }

    public static void main(String[] args) {
        MyAnimals animals = new MyAnimals();
        animals.myAnimalsTalk();
    }
}

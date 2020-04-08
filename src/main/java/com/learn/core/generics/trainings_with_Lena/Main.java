package com.learn.core.generics.trainings_with_Lena;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 20.11.18.
 */
public class Main {
    public static void main(String[] args) {


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("A"));
        cats.add(new Cat("B"));
        cats.add(new Cat("C"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        printAll(cats);

        addToAll(animals);

    }
//принцип PECS для понимания где какой WILDCARD использовать:
//Producer extends (only "produce", we can only read from this type)
//Consumer super ("consume", we can only add to this type)

    public static void printAll(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.getName());
        }
        list.add(null);//исключение: можем записать в Produser значение 'null'
    }

    public static void addToAll(List<? super Cat> list) {
       list.add(new Cat("D"));
       list.add(new Cat("E"));
        for (Object o : list) { //исключение: можем прочитать из Consumer'a Object
            System.out.println(o.getClass().getName());
        }
    }
}
 class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }
}
 class Cat extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    Cat(String name) {
        this.name = name;
    }

}

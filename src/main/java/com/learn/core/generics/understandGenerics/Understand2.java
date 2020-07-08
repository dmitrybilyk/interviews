package com.learn.core.generics.understandGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 21.11.18.
 */
public class Understand2 {
    public static void main(String[] args) {
        List<? extends Number> foo3 = new ArrayList<Double>();

        List<Horse> list = new ArrayList<>();
        list.add(new Horse());
    }

    static class Animal{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Horse extends Animal {

    }
}

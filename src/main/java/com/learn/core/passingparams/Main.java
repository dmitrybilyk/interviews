package com.learn.core.passingparams;

import org.omg.CORBA.BooleanHolder;

/**
 * Created by dik81 on 20.12.18.
 */
public class Main {
    static class Cat{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Dima");
        cat.setAge(38);
//        int a = 10;
        doStuff(cat);
        Boolean a  = true;
        BooleanHolder booleanHolder = new BooleanHolder();
        booleanHolder.value = true;
        doStuff(booleanHolder);
        System.out.println(booleanHolder.value);
    }

    private static void doStuff(Cat cat) {
        cat.setName("Lena");
    }
    private static void doStuff(BooleanHolder b) {
        b.value = false;
    }
}

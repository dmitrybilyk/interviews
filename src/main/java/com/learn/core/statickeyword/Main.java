package com.learn.core.statickeyword;

public class Main {

        public static void main(String[] args) {
                SomeClass someClass = new SomeClass();
                System.out.println(someClass.somInt);
        }

}

class SomeClass{
        public static int somStaticInt = 7;
        public int somInt = 8;

        static {
                System.out.println("it was " + somStaticInt);
                System.out.println("initialization from static block");
                somStaticInt = 555;
        }
        {
                System.out.println("it was " + somInt);
                System.out.println("initialization from init block");
                somInt = 3;
        }

        public SomeClass(){
                System.out.println("initialization from constructor");
                somInt = 5;
        }

        public static void print() {
                System.out.println("static some class");
        }
}

class SomeClassChild extends SomeClass{
        public static int somInt = 10;
        public static void print() {
                System.out.println("static some class child");
        }
}

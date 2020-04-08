package com.learn.core.lena.staticInnerClasses;
//          Nested classes are divided into two categories: static and non-static.
//          Nested classes that are declared static are called static nested classes.
//          Non-static nested classes are called inner classes.

public class StaticClassExample {   //outclass
    private String name = "My name OUT";

    public static void main(String[] args) {

    }
    private class InnerClass {
        public void printMethod() {
            System.out.println(name + "from InnerClass");
        }
    }
    public static class StaticNestedClass {
        public void printMethod2(){
            System.out.println("from StaticClass");
        }

    }
//      A nested class is a member of its enclosing class.
//       Non-static nested classes (inner classes) have access to other members of the enclosing class,
//    even if they are declared private.
//      Static nested classes do not have access to other members of the enclosing class.
//    As a member of the OuterClass, a nested class can be declared private, public, protected, or package private.
//    (Recall that outer classes can only be declared public or package private.)
//      There are two special kinds of inner classes: local classes and anonymous classes.
}

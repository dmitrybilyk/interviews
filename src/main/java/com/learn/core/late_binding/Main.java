package com.learn.core.late_binding;

/**
 * Created by dik81 on 12.01.19.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass someClass =  new SomeClass();
        ParentClass object = new ChildClass1();
        someClass.usePrintMethod(object);
    }
}

package com.learn.core.collections.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dik81 on 07.01.19.
 */
public class ExampleClassMain {
    public static void main(String[] args) {
        Set<ExampleClass> exampleClasses = new HashSet<>();
        exampleClasses.add(new ExampleClass("Name1"));
        exampleClasses.add(new ExampleClass("Name2"));
        exampleClasses.add(new ExampleClass("Name2"));
        exampleClasses.add(new ExampleClass("Name4"));
        exampleClasses.add(new ExampleClass("Name3"));

        for (ExampleClass exampleClass : exampleClasses) {
            System.out.println(exampleClass.getName());
        }
    }
}

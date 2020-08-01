package com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_abstract;

public abstract class SomeAbstractClass {
    int intValue;
    protected void print(String someThingToPrint) {
        System.out.println(intValue);
    }

    protected abstract void printAbstract() ;
    protected void printNonAbstract() {
        System.out.println("non abstract");
    };
}

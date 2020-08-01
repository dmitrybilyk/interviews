package com.learn.interview_questions.interfaces_vs_abstract_classes;

import com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_abstract.SomeAbstractClass;

public class Main {
    public static void main(String[] args) {
        SomeAbstractClass someAbstractClass = new SomeAbstractClass() {
            @Override
            protected void printAbstract() {

            }
        };
    }
}

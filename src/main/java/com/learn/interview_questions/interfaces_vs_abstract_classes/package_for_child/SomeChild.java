package com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_child;

import com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_abstract.SomeAbstractClass;
import com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_interface.SomeInterface;

public class SomeChild extends SomeAbstractClass implements SomeInterface {
    @Override
    protected void printAbstract() {
        print(String.valueOf(fieldInInterface));
    }

    @Override
    public void intPrint() {

    }
}

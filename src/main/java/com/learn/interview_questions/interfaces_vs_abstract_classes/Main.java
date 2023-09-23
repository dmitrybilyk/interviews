package com.learn.interview_questions.interfaces_vs_abstract_classes;

import com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_abstract.SomeAbstractClass;
import com.learn.interview_questions.interfaces_vs_abstract_classes.package_for_child.SomeChild;

public class Main {
    public static void main(String[] args) {
        SomeAbstractClass someChild = new SomeChild();
        someChild.setIntValue(30);
        someChild.print("");
    }
}

package com.learn.interview_questions.passingparams;

public class Test {
    public static void swap(Object x, Object y) // не работает
    {
        x = new Object();
        Object temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj2;
        swap(obj1, obj2);
    }
}
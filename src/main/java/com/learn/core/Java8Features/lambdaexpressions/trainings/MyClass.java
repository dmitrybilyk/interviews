package com.learn.core.Java8Features.lambdaexpressions.trainings;

/**
 * Created by dik81 on 21.11.18.
 */
public class MyClass {

    void myClassMethod(MyInterface myInterface){
        myInterface.myMethod("Dima");
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
//        DoubleString doubleString = new DoubleString();
        myClass.myClassMethod(DoubleString::doubleStringAndPrint);
    }
}

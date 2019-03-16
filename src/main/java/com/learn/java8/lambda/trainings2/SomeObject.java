package com.learn.java8.lambda.trainings2;

/**
 * Created by dik81 on 04.02.19.
 */
public class SomeObject {
    private String someName;
    private int someAge;

    public SomeObject(String someName, int someAge) {
        this.someName = someName;
        this.someAge = someAge;
    }

    public String getSomeName() {

        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public int getSomeAge() {
        return someAge;
    }

    public void setSomeAge(int someAge) {
        this.someAge = someAge;
    }
}

package com.learn.spring.innerbeans;

/**
 * Created by dmitry on 24.01.15.
 */
public class SomeClass {
    private String name;
    private SomeOtherClass someOtherClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SomeOtherClass getSomeOtherClass() {
        return someOtherClass;
    }

    public void setSomeOtherClass(SomeOtherClass someOtherClass) {
        this.someOtherClass = someOtherClass;
    }

}

package com.learn.spring.lookupmethod;

/**
 * Created by dmitry on 8/29/14.
 */
public abstract class SingletonClass {
    private String name;
    private int age;

    private PrototypeClass prototype;

    public SingletonClass() {
    }

    protected abstract PrototypeClass createPrototypeClass();

    public SingletonClass(PrototypeClass prototype) {
        this.prototype = prototype;
    }

    public void printDescription(){
        System.out.println(createPrototypeClass().getDescription());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

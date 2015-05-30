package com.learn.guava.predicates;

import com.google.common.base.Objects;

/**
 * Created by dmitry on 8/29/14.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

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

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }
}

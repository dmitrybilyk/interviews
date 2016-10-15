package com.learn.spring.springInheritance;

import com.google.common.base.MoreObjects;

/**
 * Created by dmitry on 23.01.15.
 */
public class ParentClass {
    private String name;
    private int age;

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
        return MoreObjects.toStringHelper(this).add("name", name).add("age", age).toString();
    }
}

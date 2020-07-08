package com.learn.core.collections;

/**
 * Created by dmitry on 17.08.17.
 */
public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
     public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Person other = null;
        if (obj instanceof Person) {
            other = (Person) obj;
        } else {
            return false;
        }
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }
}

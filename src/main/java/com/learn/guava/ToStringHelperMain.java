package com.learn.guava;

import com.google.common.base.Objects;

/**
 * Created by dmitry on 8/28/14.
 */
public class ToStringHelperMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        student.setName("Dima");
        System.out.println(student);
    }
}

class Student{
    private String name;
    private int age;
    private String someString;

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

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                //.omitNullValues()
                .toString();
    }
}

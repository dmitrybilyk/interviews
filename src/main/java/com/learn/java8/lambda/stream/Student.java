package com.learn.java8.lambda.stream;

/**
 * Created by dik81 on 12.01.19.
 */
public class Student {
    private String name;
    private String group;
    private Integer age;

    public Student(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

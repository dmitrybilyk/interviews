package com.learn.patterns.trainings24012019.builder;

/**
 * Created by dik81 on 24.01.19.
 */
public class Student {
    private String name;
    private int age;
    private int rate;
    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.rate = builder.rate;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private int rate;
        public StudentBuilder(String name) {
            this.name = name;
        }
        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
        public StudentBuilder rate(int rate) {
            this.rate = rate;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
    public class SomeClass{

    }
}

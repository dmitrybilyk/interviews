package com.learn.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class Student {
    private String name;
    private int age;
    private String color;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String color;

        public StudentBuilder(String name) {
            this.name = name;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setColor(color);
            return student;
        }
    }
}

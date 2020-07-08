package com.learn.core.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student extends ParentStudent{
    private int age;
    private String name;

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

    public static void main(String[] args) {
        Student studentLena = new Student();
        studentLena.setAge(38);
        studentLena.setName("Dima");
        Student studentDima = new Student();
        studentDima.setAge(38);
        studentDima.setName("Dima2");

        System.out.println(studentLena.equals(studentDima));
        Map<Student, String> map = new HashMap<>();
        map.put(studentDima, "Good");
        map.put(studentLena, "Better");

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age &&
//                Objects.equals(name, student.name);
//    }

    @Override
    public int hashCode() {
        return 42;
    }
}

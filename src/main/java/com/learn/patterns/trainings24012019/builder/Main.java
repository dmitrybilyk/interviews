package com.learn.patterns.trainings24012019.builder;

/**
 * Created by dik81 on 24.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Dima").age(38).build();
        String s = "dfd";
        Student.SomeClass someClass = new Student(new Student.StudentBuilder("Ddd")).new SomeClass();
    }
}

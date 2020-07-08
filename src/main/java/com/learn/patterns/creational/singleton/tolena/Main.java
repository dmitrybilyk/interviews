package com.learn.patterns.creational.singleton.tolena;

/**
 * Created by dik81 on 08.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("dima").age(44).build();
    }
}

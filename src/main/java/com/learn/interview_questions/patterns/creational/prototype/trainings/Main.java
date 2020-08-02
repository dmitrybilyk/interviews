package com.learn.interview_questions.patterns.creational.prototype.trainings;

/**
 * Created by dmitry on 26.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Student student = PrototypeFactory.getInstance();
        System.out.println(student.equals(PrototypeFactory.getInstance()));
    }
}

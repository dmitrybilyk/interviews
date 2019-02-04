package com.learn.patterns.creational.prototype.trainings;

import org.jetbrains.annotations.NotNull;

/**
 * Created by dmitry on 26.01.19.
 */
public class PrototypeFactory {
    private static Student student;
    static {
        student = getStudent();
    }

    @NotNull
    private static Student getStudent() {
        return new Student("Some name", new Farther());
    }

    public static Student getInstance() {
        try {
            return (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return getStudent();
    }
}

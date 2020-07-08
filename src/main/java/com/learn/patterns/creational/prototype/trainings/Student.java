package com.learn.patterns.creational.prototype.trainings;

import java.util.Objects;

/**
 * Created by dmitry on 26.01.19.
 */
public class Student implements Cloneable{
    private String name;
    private Farther farther;

    public Student(String name, Farther farther) {
        this.name = name;
        this.farther = farther;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.farther = this.farther.clone();
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farther getFarther() {
        return farther;
    }

    public void setFarther(Farther farther) {
        this.farther = farther;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, farther);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(name, ((Student) obj).getName()) &&
                Objects.equals(farther, student.getFarther());
    }
}

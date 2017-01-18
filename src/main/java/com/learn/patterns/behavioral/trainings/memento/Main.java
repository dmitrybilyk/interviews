package com.learn.patterns.behavioral.trainings.memento;

/**
 * Created by dmitry on 18.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Student student = new Student("Dima", 35);
    System.out.println(student.getName());

    CareTaker careTaker = new CareTaker();
    careTaker.save(student);

    student.setName("Ruslan");
    System.out.println(student.getName());

    careTaker.restore(student);

    System.out.println(student.getName());
  }
}

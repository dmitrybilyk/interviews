package com.learn.patterns.behavioral.trainings.memento;

/**
 * Created by dmitry on 18.01.17.
 */
public class CareTaker {
  private Object obj;
  public void restore(Student student) {
    student.restore(obj);
  }
  public void save(Student student) {
    this.obj = student.save(student);
  }
}

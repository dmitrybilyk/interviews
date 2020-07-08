package com.learn.patterns.behavioral.trainings.memento;

/**
 * Created by dmitry on 18.01.17.
 */
public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
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

  public Memento save (Student student) {
    return new Memento(student.getName(), student.getAge());
  }

  public void restore(Object student) {
    Memento memento = (Memento) student;
    this.name = memento.getName();
    this.age = memento.getAge();
  }

  private class Memento {
    private String name;
    private int age;

    public Memento(String name, int age) {
      this.name = name;
      this.age = age;
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
  }

}

package com.learn.guava.ordering;

import com.google.common.collect.ComparisonChain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dmitry on 16.04.15.
 */
public class OrderListOfObjects {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Dima"));
    students.add(new Student("Andrey"));
    students.add(new Student("Nikita"));
    sort(students);

    for (Student student : students) {
      System.out.println(student.getName());
    }
  }


  private static void sort(List<Student> pizzas){
    Collections.sort(pizzas, new Comparator<Student>() {
      @Override
      public int compare(Student p1, Student p2) {
        return ComparisonChain.start().compare(p1.getName(), p2.getName()).result();
        // or in case the fields can be null:
        /*
          return ComparisonChain.start()
              .compare(p1.size, p2.size, Ordering.natural().nullsLast())
              .compare(p1.nrOfToppings, p2.nrOfToppings, Ordering.natural().nullsLast())
              .compare(p1.name, p2.name, Ordering.natural().nullsLast())
              .result();
         */
      }
    });
  }


}

class Student {
  public Student(String name) {
    this.name = name;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

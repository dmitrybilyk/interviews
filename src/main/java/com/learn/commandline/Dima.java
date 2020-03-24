//package com.learn.commandline;

import com.learn.commandline.newpack.Student;
import com.learn.commandline.newpack3.Pupil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//import newpack.Student;
//import newpack3.Pupil;

public class Dima {
  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Dim");
    System.out.println(student.getName());
    
    Pupil pupil = new Pupil();
    pupil.setName("pupil");
    System.out.println(pupil.getName());

System.out.println(System.getProperty("java.class.path"));
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println(sumAll(numbers, n -> n > 3));
  }

  public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
    int total = 0;
    for (int number : numbers) {
      if (p.test(number)) {
        total += number;
      }
    }
    return total;
  }
}

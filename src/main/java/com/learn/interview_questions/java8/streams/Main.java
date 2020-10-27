package com.learn.interview_questions.java8.streams;


import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
//    System.out.println(Stream.of(new Human("Dima", 39), new Human("Lent", 33),
//            new Human("Oksana", 41), new Human("Ruslan", 43))
//            .reduce(0, (s, s2) -> {
//              if (s2.getAge() < 40) {
//                return s + s2.getAge();
//              } else {
//                return s;
//              }
//            }, Integer::sum));
        Stream.of(new Human("Dima", 39), new Human("Lent", 33),
            new Human("Oksana", 41), new Human("Ruslan", 43)).flatMap(human -> Stream.of(human.getName(),
                human.getAge())).forEach(System.out::println);
  }
}

class Human {
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private String name;
  private int age;

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

  @Override
  public String toString() {
    return "Human{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}

package com.learn.core.Java8Features.defaultinterfaceimplementation;

/**
 * Created by dik81 on 11/26/14.
 */
public class Main {
  public static void main(String[] args) {

//    Formula formula = new Formula() {
//      @Override
//      public double calculate(int a) {
//        return sqrt(a * 100);
//      }
//    };
//    System.out.println(formula.calculate(1));
//    System.out.println(formula.sqrt(100));

    int num = 1;

    Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
//    num = 3;

    stringConverter.convert(2);     // 3

    Converter<String, Integer> converter = Integer::valueOf;
    Integer converted = converter.convert("123");
    System.out.println(converted);    // 123


    Something something = new Something();
    Converter<String, String> converter2 = something::startsWith;
    String converted2 = converter2.convert("Java");
    System.out.println(converted2);    // "J"


    PersonFactory<Person> personFactory = Person::new;
    Person person = personFactory.create("Peter", "Parker");
    System.out.println(person);


//    Внутри лямбда-выражений запрещено обращаться к методам по умолчанию. Следующий код не скомпилируется:

//    Formula2 formula = (a) -> calculate(a * 100);
  }


}

interface Formula {
  double calculate(int a);

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}

class Formula2 {
  double calculate(int a){
    return (double) a;
  }

//  default double sqrt(int a) {
//    return Math.sqrt(a);
//  }
}


@FunctionalInterface
interface Converter<F, T> {
  T convert(F from);
}

class Something {
  String startsWith(String s) {
    return String.valueOf(s.charAt(0));
  }
}


class Person {
  String firstName;
  String lastName;

  Person() {}

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

interface PersonFactory<P extends Person> {
  P create(String firstName, String lastName);
}


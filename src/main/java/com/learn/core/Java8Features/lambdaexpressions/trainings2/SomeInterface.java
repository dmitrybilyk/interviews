package com.learn.core.Java8Features.lambdaexpressions.trainings2;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

@FunctionalInterface
public interface SomeInterface {
    public static void main(String[] args) {

        System.out.println(System.getProperty("java.class.path"));

        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        Stream<Human> humanStream = humans.stream();

        List<String> petNames = humans.stream()
                .flatMap(human -> human.getPets().stream()) //преобразовываем Stream<Human> в Stream<List<Pet>>
                .collect(Collectors.toList());

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]

//        List<String> numbers = new ArrayList<>();
//        for (Car car : cars) {
//            numbers.add(car.getNumber());
//        }
//        numbers.forEach(System.out::println);

//        List<String> numbers = cars.stream().filter(car -> car.getYear() > 2009).map(Car::getNumber).collect(Collectors.toList());

//        for (String element : someList) {
//            System.out.println(element);
//        }

//        someList.forEach(element ->
//        {
//            System.out.println(element);
//            System.out.println(element);
//        }
//        );


//        someList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String element) {
//                System.out.println(element);
//                System.out.println(element);
//            }
//        });

//        SomeInterface someInterface = new SomeInterface() {
//            @Override
//            public String someMethod(String someParam, String someParam2) {
//                return someParam + someParam2;
//            }
//        };
//        SomeClass someClass = new SomeClass();
//        SomeInterface.staticPrint("to print");
//        Runnable r = () -> System.out.println("from my runnable");
//        r.run();
    }
    String someMethod(String someParam, String someParam2);

//    default void print(String param) {
//        System.out.println(param + " from default");
//    }

    static void staticPrint(String param) {
        System.out.println(param + " from static");
    }
}

class SomeClass implements SomeInterface{
    public void someClassMethod(SomeInterface someInterface) {
        System.out.println(someInterface.someMethod("D", "s"));
    }

    @Override
    public String someMethod(String someParam, String someParam2) {
//        print(someParam+someParam2);
        return "printed";
    }

}

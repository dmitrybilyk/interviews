package com.learn.core.Java8Features.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

        static String bigName = "SomeBigVeryBigNameSomeVeryBigNameFoBigNameSomeBigVeryBigNameSomeVeryBigNameFoBigName";

        public static void main(String[] args) {
                SomeInterface someInterface = (someParameter)-> System.out.println(someParameter + "fdfd");
//                someInterface.printString("Dima");
//                System.out.println(someInterface.printString2("lena"));

//                List<String> list = Arrays.asList("Dima", "Lena");
//                Consumer<String> consumer = System.out::println;
//                list.forEach(consumer);
//
//                List<String> result = list.stream().filter(param->param.contains("en")).collect(Collectors.toList());
//
//
//                MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
////                System.out.println(methodReferenceExample::calculateName);
//                result.forEach(MethodReferenceExample::calculateNameStatic);
//
                List<Integer> integersList = Arrays.asList(50);
                Integer someInteger = 50;
//
//                List<String> strings = integersList.stream().map(String::valueOf).collect(Collectors.toList());

                Predicate<Integer> compareTo50Predicate = whatToCompare -> whatToCompare.equals(someInteger);
                Consumer<Integer> printConsumer = (param) -> {
                        if (param > 70) {
                                System.out.println(param * 100);
                        } else {
                                System.out.println(param * 2);
                        }
                };
                Supplier<Integer> stringSupplier = ()-> bigName.indexOf("FoBig");
                printMulty100(compareTo50Predicate, printConsumer, stringSupplier);

        }

        private static void printMulty100(Predicate<Integer> compareTo50Predicate, Consumer<Integer> printConsumer,
                Supplier<Integer> stringSupplier) {
                for (int i = 0; i < 100; i++) {
                  if (compareTo50Predicate.test(i)) {
                          printConsumer.accept(i);
                  }
                  if (compareTo50Predicate.test(i - 30)) {
                          printConsumer.accept(stringSupplier.get());
                        }
                }
        }
}

@FunctionalInterface
interface SomeInterface {
       void printString(String param);
       default String printString2(String param) {
               return param + "from default";
       }
}

class MethodReferenceExample {
        public String calculateName(String fromName) {
                return fromName + fromName;
        }
        public static void calculateNameStatic(String fromName) {
                System.out.println(fromName + fromName);
        }
}

class SomeResult {

}



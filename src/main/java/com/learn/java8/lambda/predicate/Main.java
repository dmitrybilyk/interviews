package com.learn.java8.lambda.predicate;

import com.learn.guava.guava.eventbus.IntegerListener;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String [] a)  {


        List<String> strings = Arrays.asList("Dima", "Lena");
        strings.forEach(n -> System.out.println(n));

//        // Новый способ:
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
//        System.out.println(sum);

//        List<Integer> list = Arrays.<Integer>asList(1, 2, 3, 4, 5, 6, 7);
//
//        System.out.print("Выводит все числа: ");
//        evaluate(list, (n)->true);
//
//        System.out.print("Не выводит ни одного числа: ");
//        evaluate(list, (n)->false);
//
//        System.out.print("Вывод четных чисел: ");
//        evaluate(list, (n)-> n%2 == 0 );
//
//        System.out.print("Вывод нечетных чисел: ");
//        evaluate(list, (n)-> n%2 == 1 );
//
//        System.out.print("Вывод чисел больше 5: ");
//        evaluate(list, (n)-> n > 5 );

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

}
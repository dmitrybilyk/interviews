package com.learn.java8.lambda.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by dik81 on 12.01.19.
 */
public class Main {
    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(y -> y > 0).count();
//        System.out.println(count);
//        ArrayList<String> cities = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
//        cities.stream() // получаем поток
//                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
//                .forEach(System.out::println); // выводим отфильтрованные строки на консоль

//        List<SchoolBoy> schoolBoys = Arrays.asList(new SchoolBoy("1", "5"), new SchoolBoy("2", "2"));
//        List<Student> students = schoolBoys.stream().map(s-> new Student(s.getName(), "3")).collect(Collectors.toList());
//        students.forEach(s->System.out.println(s.getGroup()));

//        List<Student> students = Stream.of(new SchoolBoy("8", "8")).flatMap(schoolBoy -> Stream.of(new Student(schoolBoy.getName(), "7"),
//                new Student(schoolBoy.getName(), "8"))).collect(Collectors.toList());
////        students.forEach(student -> System.out.println(student.getName()));
//        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
//        Optional<Integer> result = numbersStream.reduce((x,y)->x*y);
//        System.out.println(result.get()); // 720

//        Stream<Student> phoneStream = Stream.of(new Student(30),new Student(40),new Student(33), new Student(33));
//
//        int sum = phoneStream.reduce(0,
//                (x,y)-> {
//                    if(y.getAge()<35)
//                        return x + y.getAge();
//                    else
//                        return x;
//                }
//                ,
//                (x, y)->x+y
//        );
//        System.out.println(sum); // 117000

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.addAll(Arrays.asList(new Integer[]{}));
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        min.ifPresent(v->System.out.println(v)); // 4

        Stream<Student> studentStream = Stream.of(new Student(30),new Student(40),new Student(33), new Student(33));
        Map<Integer, Integer> countINGroups = studentStream.collect(Collectors.groupingBy(Student::getAge, Collectors.summingInt(Student::getAge)));
        System.out.println(countINGroups);
    }
}

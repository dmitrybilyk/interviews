package com.learn.java8.lambda.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by dik81 on 17.11.18.
 */
public class StreamTest {
    public static void main(String[] args) {

    String[] arr = new String[]{"Ap", "B", "C", "Pop"};
    Stream<String> stream = Arrays.stream(arr);

    stream.filter(element -> element.contains("P")).forEach(System.out::println);
}

}
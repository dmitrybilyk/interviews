package com.learn.core.Java8Features.lambdaexpressions.trainings;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmitry on 28.04.17.
 */
public class MainWithForEach {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dfd", "dfd");
        strings.forEach(System.out :: println);

//        Something something = new Something();
        Converter<Integer, String> converter = String::valueOf;
        String converted = converter.convert(77);
        System.out.println(converted);    // "J"
    }
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}

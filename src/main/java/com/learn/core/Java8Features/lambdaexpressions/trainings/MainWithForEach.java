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
    }
}

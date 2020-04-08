package com.learn.core.Java8Features;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SortingByJava8 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();

    }
    public void sortingByJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}

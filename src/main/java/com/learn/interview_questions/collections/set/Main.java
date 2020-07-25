package com.learn.interview_questions.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//HashSet is based on HashMap inside (just with some dummy values)
//TreeSet is based on TreeMap and supports natural order of elements.
//LinkedHashSet supports order of insertion (or fetching) of elements.
public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        for (String s : set) {
            System.out.println(s);
        }
    }
}

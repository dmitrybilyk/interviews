package com.learn.core.Java8Features.training;

import java.util.ArrayList;
import java.util.List;

public class ForEachLamda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Dima");
        names.add("Lena");

//        names.forEach(System.out::println);
        names.forEach(name -> {
            if(name.contains("L")) {
                System.out.println(name);
            }
        } );
    }
}

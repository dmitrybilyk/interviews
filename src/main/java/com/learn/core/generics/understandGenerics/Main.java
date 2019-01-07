package com.learn.core.generics.understandGenerics;

import java.util.Arrays;

/**
 * Created by dik81 on 21.11.18.
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = {"a", "f", "c"};
        Arrays.sort(strs, String::compareToIgnoreCase);
        for (String str : strs) {
            System.out.println(str);
        }
    }
}

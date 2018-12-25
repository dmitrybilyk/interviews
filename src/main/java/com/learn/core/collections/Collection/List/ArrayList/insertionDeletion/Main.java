package com.learn.core.collections.Collection.List.ArrayList.insertionDeletion;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 25.12.18.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arStringsEnd = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arStringsEnd.add("Dima");
        }
        long startEnd = System.currentTimeMillis();
        for (int i = arStringsEnd.size() - 1; i > 0; i--) {
            arStringsEnd.remove(i);
        }
//        System.out.println(arStringsEnd.size());
        long timeForEnd = System.currentTimeMillis() - startEnd;

        List<String> arStringsStart = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            arStringsStart.add(0, "Dima");
        }
        long startStart = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            arStringsStart.remove(0);
        }
//        System.out.println(arStringsStart.size());
        long timeForStart = System.currentTimeMillis() - startStart;

        System.out.println("End - " + timeForEnd + " ; Start - " + timeForStart);
    }
}

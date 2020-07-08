package com.learn.core.lena.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 22.01.19.
 */
public class FirstClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Dima");
        names.add("Lena");
        for (int i=0; i<names.size(); i++) {
            names.set(i, addSurname(names.get(i)));
            System.out.println(names.get(i));
        }

    }
    public static String addSurname(String s) {
        s = s + " Bilyk";
        return s;
    }
}

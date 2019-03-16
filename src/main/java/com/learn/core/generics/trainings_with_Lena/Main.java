package com.learn.core.generics.trainings_with_Lena;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dik81 on 20.11.18.
 */
public class Main {
    static List<Dima> all = new ArrayList<>();
    public static void main(String[] args) {


        List<Nikita> nikitas = new ArrayList<>();
        nikitas.add(new Nikita());
        nikitas.add(new Nikita());

        List<Dima> list = new ArrayList<>();
        list.add(new Dima());
        list.add(new Dima());

        printAll(nikitas);

        addToAll(nikitas);

    }

    static class Dima{
        static String name;
    }

    static class Nikita extends Dima {
        static String name;
    }

    public static void printAll(List<? extends Dima> list) {
        for (Dima dima : list) {
            System.out.println(dima);
        }
    }

    public static void addToAll(List<? super Nikita> list) {
        for (Object o : list) {
//            all.add(o);
        }
    }
}

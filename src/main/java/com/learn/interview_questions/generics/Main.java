package com.learn.interview_questions.generics;

import java.util.ArrayList;

public class Main {
    static class Fruit {
        int weight;
    }
    static class Citrus extends Fruit {
        int weight;
    }
    static class Orange extends Citrus {
        int color;
    }
    static class BigRoundOrange extends Orange {
        int size = 100;
    }

//    private static int totalWeight(ArrayList<Orange> oranges) {
    private static int totalWeight(ArrayList<? extends Orange> oranges) {
        int weight = 0;
        Fruit fruit = oranges.get(0);
//        oranges.add(new BigRoundOrange());
//        BigRoundOrange bigRoundOrange = oranges.get(0);
        for (Orange orange : oranges) {
            weight += orange.weight;
        }
        return weight;
    }

    private static void addOranges(ArrayList<? super Fruit> oranges) {
        oranges.add(new Fruit());
    }

    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        Citrus citrus = new Citrus();
//        Orange orange = new Orange();
//        fruit = citrus;
//        citrus = fruit;
//        ArrayList<Citrus> citrusList = new ArrayList<>();
//        fruit = citrusList.get(0);
//        citrus = citrusList.get(0);
//        orange = citrusList.get(0);
//
//        ArrayList<Orange> orangeList = new ArrayList<>();
//
//        citrusList = orangeList;
//
//        ArrayList<Orange> bigRoundOranges = new ArrayList<>();
//
//        totalWeight(bigRoundOranges);


    }
}

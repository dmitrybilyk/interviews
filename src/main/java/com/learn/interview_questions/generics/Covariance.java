package com.learn.interview_questions.generics;

import java.util.ArrayList;

public class Covariance {
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
//        !!!CAN READ - Type or parent types
//        BigRoundOrange bigRoundOrange = oranges.get(0);
        Orange orange = oranges.get(0);
        Fruit fruit = oranges.get(0);

        //        !!!CAN ADD - Nothing
//        oranges.add(new Object());
//        oranges.add(new Orange());
        return 0;
    }

    public static void main(String[] args) {

//        !!!CAN ASSIGN - can assign list of subtypes or the same type
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<BigRoundOrange> bigRoundOranges = new ArrayList<>();
        ArrayList<Fruit> fruits = new ArrayList<>();
//        totalWeight(fruits);
        totalWeight(bigRoundOranges);
        totalWeight(oranges);

    }
}

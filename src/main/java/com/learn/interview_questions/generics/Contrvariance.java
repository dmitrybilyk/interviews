package com.learn.interview_questions.generics;

import java.util.ArrayList;

public class Contrvariance {
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
    private static int totalWeight(ArrayList<? super Orange> oranges) {
//        !!!CAN READ - just Object type
//        BigRoundOrange bigRoundOrange = oranges.get(0);
        Object orange = oranges.get(0);
//        Fruit fruit = oranges.get(0);

        //        !!!CAN ADD - element of any type for which Orange is a super or null or Orange type itself
//        oranges.add(new Fruit());
        oranges.add(new Orange());
        oranges.add(null);
        oranges.add(new BigRoundOrange());
        return 0;
    }

    public static void main(String[] args) {

//        !!!CAN ASSIGN - can assign list of parent types or the same type
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<BigRoundOrange> bigRoundOranges = new ArrayList<>();
        ArrayList<Fruit> fruits = new ArrayList<>();
        totalWeight(fruits);
//        totalWeight(bigRoundOranges);
        totalWeight(oranges);

    }
}

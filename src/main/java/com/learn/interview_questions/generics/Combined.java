package com.learn.interview_questions.generics;

import java.util.ArrayList;

public class Combined {
    static class Fruit {
        int weight;
    }
    static class Citrus extends Covariance.Fruit {
        int weight;
    }
    static class Orange extends Covariance.Citrus {
        int color;
    }
    static class BigRoundOrange extends Covariance.Orange {
        int size = 100;
    }

    public static void main(String[] args) {
        Covariance.Fruit fruit = new Covariance.Fruit();
        Covariance.Citrus citrus = new Covariance.Citrus();
        Covariance.Orange orange = new Covariance.Orange();

//        We can assign orange to citrus because it's lower in the inheritance hierarchi
        citrus = orange;

//        orange = fruit  <<< compilation error

        ArrayList<Covariance.Citrus> citruses = new ArrayList<>();
        fruit = citruses.get(0);
        citrus = citruses.get(0);

//        orange = citruses.get(0); <<< compilation error, need to cast

        ArrayList<Covariance.Orange> oranges = new ArrayList<>();

//        citruses = oranges; <<< compilation error. Because it's forbidden. In case it worked we would
//        get from source list not orange but citrus (different type, has different set of fields even).
//        This is called invariance. Generics in java are invariant.

        totalWeight(oranges); // <<< works well
//        totalWeight(citruses) <<< compilation error because of invariance
        totalWeight(citruses); // works after adding `? extends Citrus`. It's called Covariance!!!.
//      With a such covariant type we can read objects of Citrus and all his children
//        We can not add anything to the list of such a type because we can not predict
//        and know how many children types Citrus has and we can break an integrity of the list
//        (different types in the same list)

//        So in case of covariant type we can send to `totalWeight` method list of mentioned class and
//        also lists of all his children. To read from this covariant list we may class Citrus and all his
//        parents. And we can not add to that list at all!


//        ----------- adding to list ------------
        addToList(oranges); // works well
//        addToList(citruses); compilation error because types are invariant. But it would be ok to
//        add orange ot the list of citruses as orange is a child of citrus and would not break anything:
//        citruses.add(new Orange()); Works well
//

//        after made type Contravariant - `? super Citrus` - method accepts Citruses:
        addToList(citruses);
//
//        From Contravariant type we can get just Object as it's a Parent of anything. It's impossible
//        to determine which parent you want and java returns just Object.
//        We can send to such a methods just List of edge type or it's Parents (because adding the child would
//        add new fields....
//        To such a list we can add just edge type or it's children


    }

//initial
//    private static int totalWeight(ArrayList<Orange> oranges) {
//        int weight = 0;
//        for(int i = 0; i < oranges.size(); i++) {
//            weight += oranges.get(i).weight;
//        }
//        return weight;
//    }

    //after adding of `? extends Citrus` we can calculate weight for Citrus and all his children
    private static int totalWeight(ArrayList<? extends Covariance.Citrus> oranges) {
        int weight = 0;
        for(int i = 0; i < oranges.size(); i++) {
            weight += oranges.get(i).weight;
        }
        return weight;
    }

//initial. Works just for Oranges
//    private static void addToList(ArrayList<Orange> oranges) {
//        for(int i = 0; i < oranges.size(); i++) {
//            oranges.add(new Orange());
//        }
//    }


    //second. changed type to `? super Orange` - and now it's a Contravariant type
    private static void addToList(ArrayList<? super Covariance.Orange> oranges) {
        for(int i = 0; i < oranges.size(); i++) {
            oranges.add(new Covariance.Orange());
        }
    }
}


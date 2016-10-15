package com.learn.effectivejava.algorythms.search.sequentialsearch;

/**
 * Created by dmitry on 26.01.15.
 */
public class CustomSequentialSearch {
    public static void main(String args[]) {
        int valueToFind = 14;
        int array[] = {1, 3, 5, 11, 13, 14, 15, 16, 23, 38};
        System.out.println(contains(array, valueToFind));
    }

    public static boolean contains(int[] a, int b) {
        for (int i : a) {
            if (b == i) {
                return true;
            }
        }
        return false;
    }

}

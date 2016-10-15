package com.learn.effectivejava.algorythms.search.binarysearch.custombinary;

/**
 * Created by dmitry on 26.01.15.
 */
public class CustomBinary {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 9, 22, 234};
        int valueToSearch = 9;
        System.out.println(contains(array, valueToSearch));
    }

    private static boolean contains(int[] array, int valueToSearch) {
        int start = 0;
        int end = array.length - 1;

        while(start <= end) {
            int middle = (start + end) / 2;
            if (valueToSearch > array[middle]) {
                start = middle + 1;
            } else if (valueToSearch < array[middle]) {
                end = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

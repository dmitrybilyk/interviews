package com.learn.effectivejava.lafore.ReaderFiles.Chap03.BubbleSort;

import java.util.Arrays;

/**
 * Created by dmitry on 22.01.15.
 */
public class CustomBubbleSort {
    public static void main(String[] args) {
        int[] integers = {1,4,2,5, 2, 8, 1, 0, 2, 2, 9, 1, 4, 2, 3};
        System.out.println(Arrays.toString(bubbleSort(integers)));
    }

    private static int[] bubbleSort(int[] integers) {
        for(int i = integers.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
                if (integers[j] > integers[j + 1]){
                    int temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;
                }
            }
        }
        return integers;
    }
}

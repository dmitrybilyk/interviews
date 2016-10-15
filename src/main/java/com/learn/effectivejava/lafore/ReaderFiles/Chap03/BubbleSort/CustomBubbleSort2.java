package com.learn.effectivejava.lafore.ReaderFiles.Chap03.BubbleSort;

import java.util.Arrays;

/**
 * Created by dmitry on 22.01.15.
 */
public class CustomBubbleSort2 {
    public static void main(String[] args) {
        int[] array = {4,6,2,1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] array) {
        for (int out=array.length - 1; out > 0; out--){
            for(int in=0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in+1];
                    array[in+1] = temp;
                }
            }
        }
        return array;
    }
}

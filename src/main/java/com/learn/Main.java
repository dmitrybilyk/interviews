package com.learn;

/**
 * Created by dmitry on 10.02.18.
 */
public class Main {
    public static void main(String[] args) {
        int j, sum = -44;
        for(j = 0; j <= 20; j+=5) {
            sum += j + 1;
        }
        System.out.println(sum);
    }
}

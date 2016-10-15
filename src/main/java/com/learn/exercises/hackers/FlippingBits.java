package com.learn.exercises.hackers;

import java.util.Scanner;

public class FlippingBits {
   static int solveMeSecond(int a, int b) {
        return a+b;
   }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] chars = in.toString().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            stringBuilder.append(chars[i] == '1' ? '0' : '1');
//        }
        for( ;in.hasNext();){
            String nextInt = in.next();
            stringBuilder.append(nextInt.equals("1") ? "0" : "1");
        }
        System.out.println(stringBuilder.toString());
    }
}

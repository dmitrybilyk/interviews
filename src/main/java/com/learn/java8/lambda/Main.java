package com.learn.java8.lambda;

/**
 * Created by dik81 on 15.11.18.
 */
public class Main {
    public static void useLamda(LamdaTest test){
        System.out.println(test.test(2, 3));
    }
    public static void main(String[] args) {

    useLamda(new LamdaTest() {
        @Override
        public Integer test(Integer a, Integer b) {
           return  a + b;
        }
    });
    }
}

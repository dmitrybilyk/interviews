package com.learn.core.enums.switchwithenums;

/**
 * Created by dmitry on 13.07.17.
 */
public class Main {
    public static void main(String[] args) {
        TestEnum testEnum = TestEnum.THIRD;
        switch (testEnum) {
            case FIRST:
                System.out.println("first");
                break;
            case SECOND:
                System.out.println("second");
                break;
            case THIRD:
//                System.out.println("third");
//                break;
            case FOURTH:
                System.out.println("fourth");
                break;
        }
    }
}

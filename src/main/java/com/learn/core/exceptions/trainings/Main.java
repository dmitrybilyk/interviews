package com.learn.core.exceptions.trainings;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by dik81 on 23.11.18.
 */
public class Main {
    public static void main(String[] args) {
        int sum = 150;
        TestClass testClass = new TestClass();
//        try {
        try {
            System.out.println(testClass.testMethod("33"));
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        } catch (NotEnoughMoneyException ex) {
            ex.printStackTrace();
            System.out.println(sum);
            ex.printStackTrace();
        } catch (Throwable e) {
            System.out.println("fuc");
            e.printStackTrace();
        } finally {
            System.out.println("in finally block");
        }
//        } catch (CheckedException e) {
//            e.printStackTrace();
//        }
        System.out.println("dfd");

    }
}

package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

import org.apache.poi.xwpf.usermodel.TOC;

/**
 * Created by Dimon on 03.05.2016.
 */
public class izvlecheniye_metoda {
//    void printOwing() {
//        Enumeration elements = orders.elements();
//        double outstanding = 0.0;
//
//        // print banner
//        System.out.println ("*****************************");
//        System.out.println ("****** Customer totals ******");
//        System.out.println ("*****************************");
//
//        // print owings
//        while (elements.hasMoreElements()) {
//            Order each = (Order) elements.nextElement();
//            outstanding += each.getAmount();
//        }
//
//        // print details
//        System.out.println("name: " + name);
//        System.out.println("amount: " + outstanding);
//    }

//    TO

//    void printOwing() {
//        printBanner();
//        double outstanding = getOutstanding();
//        printDetails(outstanding);
//    }
//
//    void printBanner() {
//        System.out.println("*****************************");
//        System.out.println("****** Customer totals ******");
//        System.out.println("*****************************");
//    }
//
//    void printDetails(double outstanding) {
//        System.out.println("name: " + name);
//        System.out.println("amount: " + outstanding);
//    }
//
//    double getOutstanding() {
//        Enumeration elements = orders.elements();
//        double outstanding = 0.0;
//        while (elements.hasMoreElements()) {
//            Order each = (Order) elements.nextElement();
//            outstanding += each.getAmount();
//        }
//        return outstanding;
//    }
}

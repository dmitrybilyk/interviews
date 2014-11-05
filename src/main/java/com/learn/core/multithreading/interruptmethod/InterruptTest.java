package com.learn.core.multithreading.interruptmethod;


//For completeness, in addition to the other answers, if the thread is interrupted before
// it blocks on Object.wait(..) or Thread.sleep(..) etc., this is equivalent to it being
// interrupted immediately upon blocking on that method, as the following example shows.

//Implication: if you loop like the following, and the interrupt occurs at the exact moment
// when control has left Thread.sleep(..) and is going around the loop, the exception is
// still going to occur. So it is perfectly safe to rely on the InterruptedException being
// reliably thrown after the thread has been interrupted


public class InterruptTest {
    public static void main(String[] args) {

        Thread.currentThread().interrupt();

        printInterrupted(1, "In main");

        Object o = new Object();
        try {
            synchronized (o) {
                printInterrupted(2, "In Syncrhonyzed block");
                System.out.printf("A Time %d\n", System.currentTimeMillis());
                o.wait(100);
                System.out.printf("B Time %d\n", System.currentTimeMillis());
            }
        } catch (InterruptedException ie) {
            System.out.printf("WAS interrupted\n");
        }
        System.out.printf("C Time %d\n", System.currentTimeMillis());

        printInterrupted(3, "In main second");

        Thread.currentThread().interrupt();

        printInterrupted(4, "In main third");

        try {
            System.out.printf("D Time %d\n", System.currentTimeMillis());
            Thread.sleep(100);
            System.out.printf("E Time %d\n", System.currentTimeMillis());
        } catch (InterruptedException ie) {
            System.out.printf("WAS interrupted\n");
        }
        System.out.printf("F Time %d\n", System.currentTimeMillis());

        printInterrupted(5, "in main fouth");

        try {
            System.out.printf("G Time %d\n", System.currentTimeMillis());
            Thread.sleep(100);
            System.out.printf("H Time %d\n", System.currentTimeMillis());
        } catch (InterruptedException ie) {
            System.out.printf("WAS interrupted\n");
        }
        System.out.printf("I Time %d\n", System.currentTimeMillis());

    }
    static void printInterrupted(int n, String param) {
        System.out.printf("(%d) Am I interrupted: "+ param+"? %s\n", n,
                Thread.currentThread().isInterrupted() ? "Yes" : "No");
    }

}
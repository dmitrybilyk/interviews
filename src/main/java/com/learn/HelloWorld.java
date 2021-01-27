package com.learn;

class HelloWorld extends Thread {
    public static void main(String[] args) {
        String periodicity ="PT0s";
        java.time.Duration d = java.time.Duration.parse(periodicity);
    }

    public void run () {
        for (int i=1; i<3; i++) {
            System.out.print(i+ "..");
        }
    }
}
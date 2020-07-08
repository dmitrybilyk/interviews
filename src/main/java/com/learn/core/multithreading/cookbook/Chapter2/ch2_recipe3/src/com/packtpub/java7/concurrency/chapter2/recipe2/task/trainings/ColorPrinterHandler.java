package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.trainings;

/**
 * Created by dmitry on 28.04.17.
 */
public class ColorPrinterHandler implements Runnable {
    private Printer printer;

    public ColorPrinterHandler(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            printer.print();
        }
    }
}

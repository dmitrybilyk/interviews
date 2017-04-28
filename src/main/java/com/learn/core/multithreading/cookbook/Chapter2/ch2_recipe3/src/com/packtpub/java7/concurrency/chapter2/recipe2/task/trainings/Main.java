package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.trainings;

/**
 * Created by dmitry on 28.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        SheetProvider sheetProvider = new SheetProvider(printer);
        ColorPrinterHandler colorPrinterHandler = new ColorPrinterHandler(printer);

        Thread sheetProviderThread = new Thread(sheetProvider);
        Thread colorPrinterHanlderThread = new Thread(colorPrinterHandler);

        sheetProviderThread.start();
        colorPrinterHanlderThread.start();

        try {
           sheetProviderThread.join();
           colorPrinterHanlderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

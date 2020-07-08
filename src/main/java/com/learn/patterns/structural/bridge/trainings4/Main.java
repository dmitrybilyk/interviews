package com.learn.patterns.structural.bridge.trainings4;

/**
 * Created by dik81 on 07.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Gui gui = new AdminGui(new Windows());
        gui.work();
        gui = new UserGui(new Ubuntu());
        gui.work();
    }
}

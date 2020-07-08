package com.learn.patterns.structural.bridge.trainings4;

/**
 * Created by dik81 on 07.02.19.
 */
public class AdminGui extends Gui {
    public AdminGui(OS os) {
        super(os);
    }

    @Override
    public void work() {
        System.out.println("admin");
        os.work();
    }
}

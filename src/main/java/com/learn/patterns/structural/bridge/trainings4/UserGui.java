package com.learn.patterns.structural.bridge.trainings4;

/**
 * Created by dik81 on 07.02.19.
 */
public class UserGui extends Gui {
    public UserGui(OS os) {
        super(os);
    }

    @Override
    public void work() {
        System.out.println("user");
        os.work();
    }
}

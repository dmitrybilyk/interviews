package com.learn.core.interfacesAndAbstractClasses;

/**
 * Created by dik81 on 21.12.18.
 */
public abstract  class AbstractPlayer extends AbstractPlayer2 {

    int strentch;

    public AbstractPlayer(int strentch) {
        this.strentch = strentch;
    }

    public AbstractPlayer() {

    }

    @Override
    public void play() {
        System.out.println("play");
    }

    public static void play2(){
        System.out.println("static");
    };
}

package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public class AiringVisitorImpl implements RoomVisitor {
    @Override
    public void visit(Hall hall) {
        System.out.println("airing the hall");
    }

    @Override
    public void visit(Kitchen kitchen) {
        System.out.println("airing the kitchen");
    }

    @Override
    public void visit(RestRoom restRoom) {
        System.out.println("airing the restroom");
    }
}

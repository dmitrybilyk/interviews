package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public class CleaningRoomsVisitor implements RoomVisitor {
    @Override
    public void visit(Hall hall) {
        System.out.println("cleaning the call");
    }

    @Override
    public void visit(Kitchen kitchen) {
        System.out.println("cleaning the kitchen");
    }

    @Override
    public void visit(RestRoom restRoom) {
        System.out.println("cleaning the restroom");
    }
}

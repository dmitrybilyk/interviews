package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public class RestRoom implements RoomElement{
    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }

    @Override
    public void accept(RepairVisitor visitor) {
        visitor.visit(this);
    }
}

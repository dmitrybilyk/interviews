package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public interface RoomElement {
    void accept(RoomVisitor visitor);
    void accept(RepairVisitor visitor);
}

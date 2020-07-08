package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public interface RoomVisitor {
    void visit(Hall hall);
    void visit(Kitchen kitchen);
    void visit(RestRoom restRoom);
}

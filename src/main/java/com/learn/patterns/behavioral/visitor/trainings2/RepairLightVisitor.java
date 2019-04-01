package com.learn.patterns.behavioral.visitor.trainings2;

/**
 * Created by dik81 on 01.04.19.
 */
public class RepairLightVisitor implements RepairVisitor {
    @Override
    public void visit(Hall roomElement) {
        System.out.println("repairing the hall");
    }

    @Override
    public void visit(Kitchen kitchen) {
        System.out.println("repairing the kitchen");
    }

    @Override
    public void visit(RestRoom restRoom) {
        System.out.println("repairing the restroom");
    }
}

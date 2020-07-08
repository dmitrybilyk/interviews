package com.learn.patterns.behavioral.visitor.trainings2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dik81 on 01.04.19.
 */
public class Main {
    public static void main(String[] args) {
        List<RoomElement> roomElementList = Arrays.asList(new Hall(), new Kitchen(), new RestRoom());
        for (RoomElement roomElement : roomElementList) {
            roomElement.accept(new AiringVisitorImpl());
            roomElement.accept(new CleaningRoomsVisitor());
            roomElement.accept(new RepairLightVisitor() {
            });
        }
    }
}

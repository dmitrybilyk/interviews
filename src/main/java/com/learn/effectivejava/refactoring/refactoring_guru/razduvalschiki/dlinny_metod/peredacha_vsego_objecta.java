package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

/**
 * Created by Dimon on 03.05.2016.
 */
public class peredacha_vsego_objecta {
//    class Room {
//        // ...
//        public boolean withinPlan(HeatingPlan plan) {
//            int low = getLowestTemp();
//            int high = getHighestTemp();
//            return plan.withinRange(low, high);
//        }
//    }
//
//    class HeatingPlan {
//        private TempRange range;
//        public boolean withinRange(int low, int high) {
//            return (low >= range.getLow() && high <= range.getHigh());
//        }

//    TO

//    class Room {
//        // ...
//        public boolean withinPlan(HeatingPlan plan) {
//            return plan.withinRange(this);
//        }
//    }
//
//    class HeatingPlan {
//        private TempRange range;
//        public boolean withinRange(Room room) {
//            return (room.getLowestTemp() >= range.getLow() && room.getHighestTemp() <= range.getHigh());
//        }
//    }
}

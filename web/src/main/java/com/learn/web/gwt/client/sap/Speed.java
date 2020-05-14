package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sse.datamining.annotations.Statistic;

/**
 * A speed, convertible in various units of measure. Can be negative.
 * 
 * @author Axel Uhl (d043530)
 *
 */
public interface Speed extends Comparable<Speed>, Serializable {
    final static Speed NULL = new Speed() {
        private static final long serialVersionUID = 1448378212070589610L;

        @Override
        public int compareTo(Speed o) {
            return getMetersPerSecond() > o.getMetersPerSecond() ? 1 : getMetersPerSecond() == o.getMetersPerSecond() ? 0 : -1;
        }

        @Override
        public double getKnots() {
            return 0;
        }

        @Override
        public double getMetersPerSecond() {
            return 0;
        }

        @Override
        public double getKilometersPerHour() {
            return 0;
        }

        @Override
        public double getBeaufort() {
            return 0;
        }

        @Override
        public Distance travel(TimePoint from, TimePoint to) {
            return Distance.NULL;
        }
        
        @Override
        public Duration getDuration(Distance distance) {
            throw new ArithmeticException("Cannot determine duration for any distance with zero speed");
        }

        @Override
        public String toString() {
            return "0kn";
        }

        @Override
        public double getStatuteMilesPerHour() {
            return 0;
        }

        @Override
        public Distance travel(Duration duration) {
            return Distance.NULL;
        }
        
        @Override
        public double divide(Speed speed) {
            return 0;
        }
    };
    
    @Statistic(messageKey="speedInKnots", resultDecimals=2)
    double getKnots();

    double getMetersPerSecond();

    double getKilometersPerHour();
    
    double getBeaufort();
    
    double getStatuteMilesPerHour();

    /**
     * Traveling at this speed starting at time <code>from</code> until time </code>to</code>, how far have we traveled?
     * If <code>to</code> is before </code>from</code>, the speed will be applied in reverse. If this speed has a negative
     * amount then so will the resulting distance.
     */
    Distance travel(TimePoint from, TimePoint to);

    /**
     * The duration it takes to travel the <code>distance</code> specified on a great circle (the "straight
     * line" on a sphere) with this speed.
     */
    Duration getDuration(Distance distance);

    Distance travel(Duration duration);
    
    /**
     * Divides this speed by the other {@code speed}.
     * 
     * @param speed
     *            must not be {@code null}, or a {@link NullPointerException} will result
     */
    double divide(Speed speed);
}

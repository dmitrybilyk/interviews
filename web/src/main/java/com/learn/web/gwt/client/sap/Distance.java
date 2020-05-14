package com.learn.web.gwt.client.sap;

import java.io.Serializable;



/**
 * A distance which can be converted to various units of measure. Can be negative.
 * 
 * @author Axel Uhl (d043530)
 *
 */
public interface Distance extends Comparable<Distance>, Serializable {
    static class NullDistance implements Distance {
        private static final long serialVersionUID = -3167560884686340893L;

        @Override
        public int compareTo(Distance o) {
            return getMeters() > o.getMeters() ? 1 : getMeters() == o.getMeters() ? 0 : -1;
        }

        @Override
        public double getGeographicalMiles() {
            return 0;
        }

        @Override
        public double getSeaMiles() {
            return 0;
        }

        @Override
        public double getNauticalMiles() {
            return 0;
        }

        @Override
        public double getMeters() {
            return 0;
        }

        @Override
        public Duration atSpeed(Speed speed) {
            return Duration.NULL;
        }

        @Override
        public double getKilometers() {
            return 0;
        }

        @Override
        public double getCentralAngleDeg() {
            return 0;
        }

        @Override
        public double getCentralAngleRad() {
            return 0;
        }

        @Override
        public Distance scale(double factor) {
            return this;
        }

        @Override
        public Speed inTime(long milliseconds) {
            return Speed.NULL;
        }
        
        @Override
        public Speed inTime(Duration duration) {
            return Speed.NULL;
        }
        
        @Override
        public Distance add(Distance d) {
            return d;
        }
        
        @Override
        public String toString() {
            return "0m";
        }

        @Override
        public double divide(Distance other) {
            final double result;
            if (other.getMeters() == 0) {
                result = 0./0.;
            } else {
                result = 0;
            }
            return result;
        }

        @Override
        public Distance abs() {
            return this;
        }
    }
    
    static NullDistance NULL = new NullDistance();
    
    double getGeographicalMiles();

    double getSeaMiles();

    double getNauticalMiles();

    double getMeters();

    double getKilometers();

    double getCentralAngleDeg();

    double getCentralAngleRad();

    Distance scale(double factor);
    
    /**
     * Computes the (undirected) average speed one has traveled at when passing this distance in the number of
     * milliseconds specified. Sign-sensitive, meaning, e.g., that if this distance is negative and the time is positive
     * then the resulting speed will be negative.
     */
    Speed inTime(long milliseconds);
    
    Speed inTime(Duration duration);
    
    /**
     * Computes the duration it takes to travel this distance at the given {@code speed}.
     */
    Duration atSpeed(Speed speed);
    
    Distance add(Distance d);

    /**
     * Divides this distance by the {@code other} distance. Should the {@code other} distance
     */
    double divide(Distance other);

    /**
     * If this distance is negative, returns a positive difference with the same absolute value; for positive
     * distances, this distance is returned.
     */
    Distance abs();
}

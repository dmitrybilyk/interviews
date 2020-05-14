package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sse.common.impl.MillisecondsDurationImpl;
//import com.sap.sse.common.impl.SecondsDurationImpl;

/**
 * A time duration that can be converted to various time units and that interoperates with {@link TimePoint}.
 * 
 * @author Axel Uhl (D043530)
 *
 */
public interface Duration extends Serializable, Comparable<Duration> {
    
    /**
     * This NULL {@link Duration} is defined as a {@link MillisecondsDurationImpl}, therefore it is only accurate up to
     * full milliseconds. If a higher accuracy for calculations is needed (like in the case of
     * {@link ORCPerformanceCurve}), it is recommended to use a new {@link SecondsDurationImpl} object instead.
     */
    static final Duration NULL = new MillisecondsDurationImpl(0);
    static final Duration ONE_MILLISECOND = new MillisecondsDurationImpl(1);
    static final Duration ONE_SECOND = new MillisecondsDurationImpl(1000);
    static final Duration ONE_MINUTE = ONE_SECOND.times(60);
    static final Duration ONE_HOUR = ONE_MINUTE.times(60);
    static final Duration ONE_DAY = ONE_HOUR.times(24);
    static final Duration ONE_WEEK = ONE_DAY.times(7);
    static final Duration ONE_YEAR = ONE_DAY.times(365); // well, leap years have 366 days, but this should be close enough...
    
    long asMillis();
    
    double asSeconds();
    
    double asMinutes();
    
    double asHours();
    
    double asDays();
    
    /**
     * In case this duration is positive, it is returned unmodified. Otherwise, the duration is returned negated, resulting
     * in a positive duration.
     */
    Duration abs();
    
    Duration divide(long divisor);
    Duration divide(double divisor);
    double   divide(Duration duration);
    Duration times(long factor);
    Duration times(double factor);
    
    Duration minus(Duration duration);
    Duration minus(long milliseconds);
    
    Duration plus(long milliseconds);
    Duration plus(Duration duration);

    /**
     * The "modulo" operation; imagine the operation implemented as this duration's milliseconds
     * modulo {@code d}'s milliseconds
     */
    Duration mod(Duration d);
}

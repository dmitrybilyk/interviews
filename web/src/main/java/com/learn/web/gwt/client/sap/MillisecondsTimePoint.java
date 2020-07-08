package com.learn.web.gwt.client.sap;

import java.util.Date;

//import com.sap.sse.common.TimePoint;


public class MillisecondsTimePoint extends AbstractTimePoint {
    private static final long serialVersionUID = -1021748860232043166L;
    private long millis;
    private Date date;
    
    /**
     * A time point as exact as {@link System#currentTimeMillis()}
     */
    public static TimePoint now() {
        return new MillisecondsTimePoint(System.currentTimeMillis());
    }
    
    MillisecondsTimePoint() {}; // for serialization only

    public MillisecondsTimePoint(long millis) {
        super();
        this.millis = millis;
    }
    
    public MillisecondsTimePoint(Date date) {
        super();
        this.millis = date.getTime();
    }

    protected Date getDateFromCache() {
        return date;
    }

    protected void cacheDate(Date date) {
        this.date = date;
    }

    @Override
    public long asMillis() {
        return millis;
    }

}

package com.learn.web.gwt.client.sap;

//import com.sap.sse.common.Duration;
//import com.sap.sse.common.Util;

public abstract class AbstractDuration implements Duration {
    private static final long serialVersionUID = -7217998647218524638L;

    @Override
    public String toString() {
        return (Math.signum(asHours()) < 0 ? "-" : "")+
                Util.padPositiveValue((int) Math.abs(asHours()), 2, 0, /* round */ false)+":"+
                Util.padPositiveValue(Math.abs(asMinutes())%60, 2, 0, /* round */ false)+":"+
                Util.padPositiveValue(Math.abs(asSeconds())%60, 2, 3, /* round */ true);
    }
}

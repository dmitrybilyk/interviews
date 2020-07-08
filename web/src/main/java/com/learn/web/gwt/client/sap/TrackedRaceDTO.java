package com.learn.web.gwt.client.sap;

import java.io.Serializable;
import java.util.Date;

public class TrackedRaceDTO implements Serializable {
    private static final long serialVersionUID = -9040930745014670924L;

    /**
     * Default constructor for GWT-Serialization
     */
    public TrackedRaceDTO() {}
    
    public boolean hasWindData;
    public boolean hasGPSData;

    public Date startOfTracking;
    public Date endOfTracking;
    public Date timePointOfNewestEvent;
    public long delayToLiveInMs;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (delayToLiveInMs ^ (delayToLiveInMs >>> 32));
        result = prime * result + ((endOfTracking == null) ? 0 : endOfTracking.hashCode());
        result = prime * result + (hasGPSData ? 1231 : 1237);
        result = prime * result + (hasWindData ? 1231 : 1237);
        result = prime * result + ((startOfTracking == null) ? 0 : startOfTracking.hashCode());
        result = prime * result + ((timePointOfNewestEvent == null) ? 0 : timePointOfNewestEvent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TrackedRaceDTO other = (TrackedRaceDTO) obj;
        if (delayToLiveInMs != other.delayToLiveInMs)
            return false;
        if (endOfTracking == null) {
            if (other.endOfTracking != null)
                return false;
        } else if (!endOfTracking.equals(other.endOfTracking))
            return false;
        if (hasGPSData != other.hasGPSData)
            return false;
        if (hasWindData != other.hasWindData)
            return false;
        if (startOfTracking == null) {
            if (other.startOfTracking != null)
                return false;
        } else if (!startOfTracking.equals(other.startOfTracking))
            return false;
        if (timePointOfNewestEvent == null) {
            if (other.timePointOfNewestEvent != null)
                return false;
        } else if (!timePointOfNewestEvent.equals(other.timePointOfNewestEvent))
            return false;
        return true;
    }
    
}

package com.learn.web.gwt.client.sap;

import java.io.Serializable;

//import com.sap.sse.common.Distance;
//import com.sap.sse.security.shared.dto.NamedDTO;

public class BoatClassDTO extends NamedDTO implements Serializable, Comparable<BoatClassDTO> {
    private static final long serialVersionUID = 1981789833769906676L;
    
    /**
     * A default boat class name; can be used, e.g., in regatta configuration "templates" which later
     * are used to configure several different regattas for different boat classes.
     */
    public static final String DEFAULT_NAME = "Default";
    
    private Distance hullLength;
    private Distance hullBeam;
    private String displayName;
    
    BoatClassDTO() {}

    public BoatClassDTO(String name, String displayName, Distance hullLength, Distance hullBeam) {
        super(name);
        this.hullLength = hullLength;
        this.hullBeam = hullBeam;
    }

    public BoatClassDTO(String name, Distance hullLength, Distance hullBeam) {
        this(name, /* display name */ null, hullLength, hullBeam);
    }

    public Distance getHullLength() {
        return hullLength;
    }
    
    public Distance getHullBeam() {
        return hullBeam;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    @Override
    public int compareTo(BoatClassDTO o) {
        return getName().compareToIgnoreCase(o.getName());
    }
}

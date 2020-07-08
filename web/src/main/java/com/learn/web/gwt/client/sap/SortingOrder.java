package com.learn.web.gwt.client.sap;

public enum SortingOrder {
    NONE, ASCENDING, DESCENDING;
    
    public boolean isAscending() {
        return this == ASCENDING;
    }

    public boolean isDescending() {
        return this == DESCENDING;
    }
}

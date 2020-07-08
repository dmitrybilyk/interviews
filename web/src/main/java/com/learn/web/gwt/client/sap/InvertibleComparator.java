package com.learn.web.gwt.client.sap;

import java.util.Comparator;

/**
 * An invertible comparator with an "ascending" flag denoting whether comparison results should be treated in
 * forward (standard ascending) order or flipped for reverse (descending) order.
 */
public interface InvertibleComparator<T> extends Comparator<T> {

    /**
     * Specify the sort order: ascending (true) or descending (false).
     */
    public void setAscending(boolean ascending);

    /**
     * Return the sort order: ascending (true) or descending (false).
     */
    public boolean isAscending();

    /**
     * Invert the sort order
     * Ascending -> descending or descending -> ascending.
     */
    public void invertOrder();
}

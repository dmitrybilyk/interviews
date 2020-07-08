package com.learn.web.gwt.client.sap;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.Header;

public abstract class SortableColumn<T, C> extends Column<T, C> {
    private SortingOrder preferredSortingOrder;
    
    protected SortableColumn(Cell<C> cell, SortingOrder preferredSortingOrder) {
        super(cell);
        setSortable(true);
        this.preferredSortingOrder = preferredSortingOrder;
    }
    
    public abstract InvertibleComparator<T> getComparator();
    
    public abstract Header<?> getHeader();

    /**
     * Allows a column to specify a style/CSS class to use to format the &lt;th&gt; header cell.
     * This default implementation returns <code>null</code>, meaning that no additional style other
     * than the GWT-provided default styles will be used.
     */
    public String getHeaderStyle() {
        return null;
    }
    
    /**
     * Allows a column to specify a style/CSS class to use to format the &lt;col&gt; element.
     * This default implementation returns <code>null</code>, meaning that no additional style other
     * than the GWT-provided default styles will be used.
     */
    public String getColumnStyle() {
        return null;
    }

    public SortingOrder getPreferredSortingOrder() {
        return preferredSortingOrder;
    }
}

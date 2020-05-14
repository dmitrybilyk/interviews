package com.learn.web.gwt.client.sap;

import com.google.gwt.cell.client.Cell;
//import com.sap.sse.common.SortingOrder;

public abstract class AbstractSortableColumnWithMinMax<T, C> extends SortableColumn<T, C> implements
        SortableColumnWithMinMax<T, C> {
    protected AbstractSortableColumnWithMinMax(Cell<C> cell, SortingOrder preferredSortingOrder) {
        super(cell, preferredSortingOrder);
    }
}

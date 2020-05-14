package com.learn.web.gwt.client.sap;

import com.google.gwt.user.cellview.client.CellTable;

/**
 * This {@link FlushableSortedCellTableWithStylableHeaders} provides the
 *
 * @author D064976
 * @param <T>
 */
public class FlushableSortedCellTableWithStylableHeaders<T> extends SortedCellTableWithStylableHeaders<T>
        implements Flushable {
    public FlushableSortedCellTableWithStylableHeaders(int pageSize, CellTable.Resources resources) {
        super(pageSize, resources);
    }
    public FlushableSortedCellTableWithStylableHeaders(int pageSize) {
        super(pageSize);
    }
}

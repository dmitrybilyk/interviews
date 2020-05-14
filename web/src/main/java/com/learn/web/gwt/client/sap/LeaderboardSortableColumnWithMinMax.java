package com.learn.web.gwt.client.sap;

import com.google.gwt.cell.client.Cell;
//import com.sap.sse.common.SortingOrder;
//import com.sap.sse.gwt.client.celltable.AbstractSortableColumnWithMinMax;

/**
 * A sortable column whose elements can be compared for a minimum and maximum value whose magnitudes can
 * reasonably be displayed in the cell, e.g. by a little background bar indicating this magnitude.
 * 
 * @author Axel Uhl (D043530)
 *
 * @param <T>
 * @param <C>
 */
public abstract class LeaderboardSortableColumnWithMinMax<T, C> extends AbstractSortableColumnWithMinMax<T, C> {
    private final DisplayedLeaderboardRowsProvider displayedLeaderboardRowsProvider;
    
    protected LeaderboardSortableColumnWithMinMax(Cell<C> cell, SortingOrder preferredSortingOrder,
            DisplayedLeaderboardRowsProvider displayedLeaderboardRowsProvider) {
        super(cell, preferredSortingOrder);
        this.displayedLeaderboardRowsProvider = displayedLeaderboardRowsProvider;
    }
    
    /**
     * Based on the rows returned by the {@link DisplayedLeaderboardRowsProvider} instance passed to the
     * constructor, updates the min/max values for this column.
     */
    @Override
    public void updateMinMax() {}
    
    /**
     * @return the leaderboard rows provider passed to the constructor
     */
    protected DisplayedLeaderboardRowsProvider getDisplayedLeaderboardRowsProvider() {
        return displayedLeaderboardRowsProvider;
    }
}

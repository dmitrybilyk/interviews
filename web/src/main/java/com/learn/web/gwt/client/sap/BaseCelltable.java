package com.learn.web.gwt.client.sap;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;

public class BaseCelltable<T> extends CellTable<T> {
    public BaseCelltable() {
        super();
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize, ProvidesKey<T> keyProvider) {
        super(pageSize, keyProvider);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize, com.google.gwt.user.cellview.client.CellTable.Resources resources,
            ProvidesKey<T> keyProvider, Widget loadingIndicator, boolean enableColGroup, boolean attachLoadingPanel) {
        super(pageSize, resources, keyProvider, loadingIndicator, enableColGroup, attachLoadingPanel);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize, com.google.gwt.user.cellview.client.CellTable.Resources resources,
            ProvidesKey<T> keyProvider, Widget loadingIndicator) {
        super(pageSize, resources, keyProvider, loadingIndicator);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize, com.google.gwt.user.cellview.client.CellTable.Resources resources,
            ProvidesKey<T> keyProvider) {
        super(pageSize, resources, keyProvider);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize, com.google.gwt.user.cellview.client.CellTable.Resources resources) {
        super(pageSize, resources);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(int pageSize) {
        super(pageSize);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }

    public BaseCelltable(ProvidesKey<T> keyProvider) {
        super(keyProvider);
        setTableBuilder(new BaseCellTableBuilder<T>(this));
    }
}

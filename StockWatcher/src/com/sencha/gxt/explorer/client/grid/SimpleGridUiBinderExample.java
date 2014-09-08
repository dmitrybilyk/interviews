/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.grid;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.Stock;
import com.sencha.gxt.examples.resources.client.model.StockProperties;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.GridView;

@Detail(name = "Basic Simple Grid (UiBinder)", icon = "basicgrid", category = "Grid", classes = {Stock.class, StockProperties.class}, files = "SimpleGridUiBinderExample.ui.xml")
public class SimpleGridUiBinderExample implements IsWidget, EntryPoint {

  private static final StockProperties gridProperties = GWT.create(StockProperties.class);

  interface MyUiBinder extends UiBinder<ContentPanel, SimpleGridUiBinderExample> {
  }

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  private ContentPanel widget;

  @UiField(provided = true)
  ColumnModel<Stock> columnModel;

  @UiField(provided = true)
  ListStore<Stock> listStore;

  @UiField
  GridView<Stock> gridView;

  @UiField
  Grid<Stock> grid;

  @Override
  public Widget asWidget() {
    if (widget == null) {
      columnModel = initColumModel();
      listStore = initListStore();

      widget = uiBinder.createAndBindUi(this);

      // Auto expand the name column
      gridView.setAutoExpandColumn(columnModel.getColumn(0));
    }

    return widget;
  }

  private ColumnModel<Stock> initColumModel() {
    ColumnConfig<Stock, String> nameCol = new ColumnConfig<Stock, String>(gridProperties.name(), 50, "Company");
    ColumnConfig<Stock, String> symbolCol = new ColumnConfig<Stock, String>(gridProperties.symbol(), 100, "Symbol");
    ColumnConfig<Stock, Double> lastCol = new ColumnConfig<Stock, Double>(gridProperties.last(), 75, "Last");

    List<ColumnConfig<Stock, ?>> columns = new ArrayList<ColumnConfig<Stock, ?>>();
    columns.add(nameCol);
    columns.add(symbolCol);
    columns.add(lastCol);

    ColumnModel<Stock> columnModel = new ColumnModel<Stock>(columns);

    return columnModel;
  }

  private ListStore<Stock> initListStore() {
    ListStore<Stock> listStore = new ListStore<Stock>(gridProperties.key());
    listStore.addAll(TestData.getStocks());
    return listStore;
  }

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

}

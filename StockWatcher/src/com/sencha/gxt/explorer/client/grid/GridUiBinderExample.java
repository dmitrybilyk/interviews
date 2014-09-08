/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.grid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.images.ExampleImages;
import com.sencha.gxt.examples.resources.client.model.Stock;
import com.sencha.gxt.examples.resources.client.model.StockProperties;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.state.client.CookieProvider;
import com.sencha.gxt.state.client.GridStateHandler;
import com.sencha.gxt.state.client.StateManager;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Resizable;
import com.sencha.gxt.widget.core.client.Resizable.Dir;
import com.sencha.gxt.widget.core.client.button.IconButton.IconConfig;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.event.CollapseEvent;
import com.sencha.gxt.widget.core.client.event.CollapseEvent.CollapseHandler;
import com.sencha.gxt.widget.core.client.event.ExpandEvent;
import com.sencha.gxt.widget.core.client.event.ExpandEvent.ExpandHandler;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.grid.CellSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.GridSelectionModel;
import com.sencha.gxt.widget.core.client.grid.GridView;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent.CellSelectionChangedHandler;
import com.sencha.gxt.widget.core.client.tips.QuickTip;

@Detail(name = "Basic Grid (UiBinder)", icon = "basicgrid", category = "Grid", classes = {
    Stock.class, StockProperties.class}, files = "GridUiBinderExample.ui.xml")
public class GridUiBinderExample implements IsWidget, EntryPoint {

  private static final StockProperties props = GWT.create(StockProperties.class);

  interface MyUiBinder extends UiBinder<ContentPanel, GridUiBinderExample> {
  }

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  private ContentPanel root;

  @UiField(provided = true)
  ColumnModel<Stock> cm;

  @UiField(provided = true)
  ListStore<Stock> store;

  @UiField
  GridView<Stock> view;

  @UiField
  Grid<Stock> grid;

  @UiField
  SimpleComboBox<String> type;

  @UiField(provided = true)
  IconConfig toolButtonIcon = ToolButton.QUESTION;

  @Override
  public Widget asWidget() {
    if (root == null) {
      final NumberFormat number = NumberFormat.getFormat("0.00");

      ColumnConfig<Stock, String> nameCol = new ColumnConfig<Stock, String>(props.name(), 50, "Company");
      ColumnConfig<Stock, String> symbolCol = new ColumnConfig<Stock, String>(props.symbol(), 100, "Symbol");
      ColumnConfig<Stock, Double> lastCol = new ColumnConfig<Stock, Double>(props.last(), 75, "Last");

      ColumnConfig<Stock, Double> changeCol = new ColumnConfig<Stock, Double>(props.change(), 100, "Change");
      changeCol.setCell(new AbstractCell<Double>() {

        @Override
        public void render(Context context, Double value, SafeHtmlBuilder sb) {
          String style = "style='color: " + (value < 0 ? "red" : "green") + "'";
          String v = number.format(value);
          sb.appendHtmlConstant("<span " + style + " qtitle='Change' qtip='" + v + "'>" + v + "</span>");
        }
      });

      ColumnConfig<Stock, Date> lastTransCol = new ColumnConfig<Stock, Date>(props.lastTrans(), 100, "Last Updated");
      lastTransCol.setCell(new DateCell(DateTimeFormat.getFormat("MM/dd/yyyy")));

      List<ColumnConfig<Stock, ?>> l = new ArrayList<ColumnConfig<Stock, ?>>();
      l.add(nameCol);
      l.add(symbolCol);
      l.add(lastCol);
      l.add(changeCol);
      l.add(lastTransCol);
      cm = new ColumnModel<Stock>(l);

      store = new ListStore<Stock>(props.key());
      store.addAll(TestData.getStocks());

      root = uiBinder.createAndBindUi(this);
      root.getHeader().setIcon(ExampleImages.INSTANCE.table());
      final Resizable resizable = new Resizable(root, Dir.E, Dir.SE, Dir.S);
      root.addExpandHandler(new ExpandHandler() {
        @Override
        public void onExpand(ExpandEvent event) {
          resizable.setEnabled(true);
        }
      });
      root.addCollapseHandler(new CollapseHandler() {
        @Override
        public void onCollapse(CollapseEvent event) {
          resizable.setEnabled(false);
        }
      });

      GridStateHandler<Stock> state = new GridStateHandler<Stock>(grid);
      state.loadState();

      type.add("Row");
      type.add("Cell");
      type.setValue("Row");
      // we want to change selection model on select, not value change which fires on blur
      type.addSelectionHandler(new SelectionHandler<String>() {

        @Override
        public void onSelection(SelectionEvent<String> event) {
          boolean cell = event.getSelectedItem().equals("Cell");
          if (cell) {
            CellSelectionModel<Stock> c = new CellSelectionModel<Stock>();
            c.addCellSelectionChangedHandler(new CellSelectionChangedHandler<Stock>() {

              @Override
              public void onCellSelectionChanged(CellSelectionChangedEvent<Stock> event) {

              }
            });

            grid.setSelectionModel(c);
          } else {
            grid.setSelectionModel(new GridSelectionModel<Stock>());
          }
        }
      });

      view.setAutoExpandColumn(nameCol);

      new QuickTip(grid);
    }

    return root;
  }

  @Override
  public void onModuleLoad() {
    StateManager.get().setProvider(new CookieProvider("/", null, null, GXT.isSecure()));
    RootPanel.get().add(asWidget());
  }

}

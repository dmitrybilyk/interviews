package stockWatcher.client;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import stockWatcher.client.popup.CwBasicPopup;
import stockWatcher.client.uibinder.HelloWidgetWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class StockWatcher implements EntryPoint {

    private static final int REFRESH_INTERVAL = 5000; // ms

    private VerticalPanel workPanel = new VerticalPanel();
    private FlexTable stocksFlexTable = new FlexTable();
    private HorizontalPanel addPanel = new HorizontalPanel();
    private TextBox newSymbolTextBox = new TextBox();
    private Button addStockButton = new Button("Add");
    private Label lastUpdatedLabel = new Label();

    private ArrayList<String> stocks = new ArrayList<String>();
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        StockWatcherConstants constants = GWT.create(StockWatcherConstants.class);
        StockWatcherMessages messages = GWT.create(StockWatcherMessages.class);

        GWT.log(messages.invalidSymbol("fuck"));
//        Window.alert(messages.invalidSymbol("yes"));

        VerticalPanel nikitaMainPanel = new VerticalPanel();
        nikitaMainPanel.addStyleName("nikitaMainPanelStyle");

        HorizontalPanel header = new HorizontalPanel();
        header.setHorizontalAlignment(HasHorizontalAlignment.HorizontalAlignmentConstant.endOf(HasDirection.Direction.RTL));
        Label headerLabel = new Label(constants.nikitasSite());
        headerLabel.setSize("100%", "200px");

        HorizontalPanel footer = new HorizontalPanel();
        HorizontalPanel center = new HorizontalPanel();

        VerticalPanel centerCenter = new VerticalPanel();
        Label centerCenterLabel = new Label("center label");
        centerCenterLabel.setSize("100%", "200px");
        centerCenterLabel.setStylePrimaryName("centerCenterLabel");
        centerCenter.add(centerCenterLabel);

        centerCenter.setStylePrimaryName("centerCenterStyle");

        VerticalPanel leftCenter = new VerticalPanel();
        Label leftCenterLabel = new Label("Left side");
        leftCenterLabel.setSize("100%", "200px");
        leftCenter.add(leftCenterLabel);

        CompositeExample compositeExample = new CompositeExample("Composite example");
        leftCenter.add(compositeExample);

        VerticalPanel rightCenter = new VerticalPanel();
        Label rightCenterLabel = new Label("Right side");
        rightCenterLabel.setSize("100%", "200px");
        rightCenter.add(rightCenterLabel);

        center.add(leftCenter);
        center.add(centerCenter);
        center.add(rightCenter);

        header.add(headerLabel);

        nikitaMainPanel.add(header);
        nikitaMainPanel.add(center);
        nikitaMainPanel.add(footer);

        // Create table for stock data.
        stocksFlexTable.setText(0, 0, "Symbol");
        stocksFlexTable.setText(0, 1, "Price");
        stocksFlexTable.setText(0, 2, "Change");
        stocksFlexTable.setText(0, 3, "Remove");
        stocksFlexTable.addStyleName("watchList");
        // Add styles to elements in the stock list table.
        stocksFlexTable.getRowFormatter().addStyleName(0, "watchListHeader");
        stocksFlexTable.getCellFormatter().addStyleName(0, 1, "watchListNumericColumn");
        stocksFlexTable.getCellFormatter().addStyleName(0, 2, "watchListNumericColumn");
        stocksFlexTable.getCellFormatter().addStyleName(0, 3, "watchListRemoveColumn");

        stocksFlexTable.setCellPadding(6);


        addPanel.addStyleName("addPanel");

        // Assemble Add Stock panel.
        addPanel.add(newSymbolTextBox);
        addPanel.add(addStockButton);

        // Assemble Main panel.
        workPanel.add(stocksFlexTable);
        workPanel.add(addPanel);
        workPanel.add(lastUpdatedLabel);


        centerCenter.add(workPanel);

        CwBasicPopup popup = new CwBasicPopup();
        centerCenter.add(popup);



        //Cell list example
        // Create a cell to render each value in the list.
        TextCell textCell = new TextCell();

        // Create a CellList that uses the cell.
        CellList<String> cellList = new CellList<String>(textCell);

        // Set the total row count. This isn't strictly necessary, but it affects
        // paging calculations, so its good habit to keep the row count up to date.
        cellList.setRowCount(DAYS.size(), true);

        // Push the data into the widget.
        cellList.setRowData(0, DAYS);

        rightCenter.add(cellList);

        CellTableExample cellTableExample = new CellTableExample();
        rightCenter.add(cellTableExample.getCellTable());


        CellTreeExample cellTreeExample = new CellTreeExample();
        rightCenter.add(cellTreeExample.getCellTree());

        CellBrowserExample cellBrowserExample = new CellBrowserExample();
        rightCenter.add(cellBrowserExample.getBrowser());


        centerCenter.getElement().getStyle().setBackgroundColor("white");


        HelloWidgetWorld helloWidgetWorld = new HelloWidgetWorld("Dima", "Nikita", "Natasha");
// Don't forget, this is DOM only; will not work with GWT widgets

        leftCenter.add(helloWidgetWorld);


        StockWatcherServiceAsync stockWatcherService = GWT.create(StockWatcherService.class);

        stockWatcherService.getMessage("Dima", new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable caught) {
                GWT.log(caught.getMessage());
            }

            @Override
            public void onSuccess(String result) {
                GWT.log("Resutl of async - " + result);
            }
        });





        RootPanel.get().add(nikitaMainPanel);

        // Associate the Main panel with the HTML host page.
//        RootPanel.get("stockList").add(workPanel);

        // Move cursor focus to the input box.
        newSymbolTextBox.setFocus(true);


        // Setup timer to refresh list automatically.
        Timer refreshTimer = new Timer() {
            @Override
            public void run() {
                refreshWatchList();
            }
        };
        refreshTimer.scheduleRepeating(REFRESH_INTERVAL);



        // Listen for mouse events on the Add button.
        addStockButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                addStock();
            }
        });

        // Listen for keyboard events in the input box.
        newSymbolTextBox.addKeyDownHandler(new KeyDownHandler() {
            public void onKeyDown(KeyDownEvent event) {
                if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    addStock();
                }
            }
        });



    }

    // The list of data to display.
    private static final List<String> DAYS = Arrays.asList("Sunday", "Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");


    /**
     * Add stock to FlexTable. Executed when the user clicks the addStockButton or
     * presses enter in the newSymbolTextBox.
     */
    private void addStock() {
        final String symbol = newSymbolTextBox.getText().toUpperCase().trim();
        newSymbolTextBox.setFocus(true);

        // Stock code must be between 1 and 10 chars that are numbers, letters, or dots.
        if (!symbol.matches("^[0-9A-Z\\.]{1,10}$")) {
//            Window.alert("'" + symbol + "' is not a valid symbol.");
            newSymbolTextBox.selectAll();
            return;
        }

        newSymbolTextBox.setText("");

        // TODO Don't add the stock if it's already in the table.
        if (stocks.contains(symbol))
            return;

        // TODO Add the stock to the table.
        int row = stocksFlexTable.getRowCount();
        stocks.add(symbol);
        stocksFlexTable.setText(row, 0, symbol);

        stocksFlexTable.setWidget(row, 2, new Label());

//        Label changeWidget = (Label)stocksFlexTable.getWidget(row, 2);
//        changeWidget.setText(changeText + " (" + changePercentText + "%)");

        // TODO Add a button to remove this stock from the table.
        // Add a button to remove this stock from the table.
        Button removeStockButton = new Button("x");
        removeStockButton.addStyleDependentName("remove");
        removeStockButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                int removedIndex = stocks.indexOf(symbol);
                stocks.remove(removedIndex);        stocksFlexTable.removeRow(removedIndex + 1);
            }
        });
        stocksFlexTable.setWidget(row, 3, removeStockButton);

        // Get the stock price.
        refreshWatchList();

    }

    /**
     * Generate random stock prices.
     */
    private void refreshWatchList() {
        final double MAX_PRICE = 100.0; // $100.00
        final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

        StockPrice[] prices = new StockPrice[stocks.size()];
        for (int i = 0; i < stocks.size(); i++) {
            double price = Random.nextDouble() * MAX_PRICE;
            double change = price * MAX_PRICE_CHANGE
                    * (Random.nextDouble() * 2.0 - 1.0);

            prices[i] = new StockPrice(stocks.get(i), price, change);
        }

        updateTable(prices);
    }

    /**
     * Update the Price and Change fields all the rows in the stock table.
     *
     * @param prices Stock data for all rows.
     */
    /**
     * Update the Price and Change fields all the rows in the stock table.
     *
     * @param prices Stock data for all rows.
     */
    private void updateTable(StockPrice[] prices) {
//        for (int i = 0; i < prices.length; i++) {
//            updateTable(prices[i]);
//        }
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }
}

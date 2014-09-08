/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.binding;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.Stock;
import com.sencha.gxt.examples.resources.client.model.StockProperties;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer.CssFloatData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.DoubleField;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FormPanelHelper;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.validator.MinNumberValidator;
import com.sencha.gxt.widget.core.client.form.validator.RegExValidator;

@Detail(name = "Basic Binding", icon = "basicbinding", category = "Binding", files = "BasicBindingExample.html", classes = {
    Stock.class, StockProperties.class})
public class BasicBindingExample implements IsWidget, EntryPoint, Editor<Stock> {
  interface StockDriver extends SimpleBeanEditorDriver<Stock, BasicBindingExample> {
  }

  interface StockTemplate extends XTemplates {
    @XTemplate(source = "BasicBindingExample.html")
    SafeHtml drawStock(Stock stock);
  }

  private FramedPanel panel;
  private Stock stock;
  private HTML display;
  private ComboBox<Stock> nameCombo;

  // editor fields
  TextField symbol;
  TextField name;
  DoubleField last;
  DoubleField change;
  DateField lastTrans;

  private ListStore<Stock> stockStore;
  private StockDriver driver = GWT.create(StockDriver.class);
  private StockProperties props;

  public Widget asWidget() {
    if (panel == null) {
      props = GWT.create(StockProperties.class);

      stockStore = new ListStore<Stock>(props.key());
      stockStore.addAll(TestData.getStocks());

      stock = stockStore.get(0);

      HorizontalPanel hp = new HorizontalPanel();
      hp.setSpacing(10);

      panel = new FramedPanel();
      panel.setHeadingHtml("Basic Binding Example");
      panel.setWidth(600);
      panel.setLayoutData(new MarginData(20));

      hp.add(updateDisplay());
      hp.add(createEditor());

      panel.add(hp);

      hp.setCellWidth(updateDisplay(), "200");

      driver.initialize(this);
      nameCombo.setValue(stock);
      driver.edit(stock);
    }

    return panel;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  private Widget createEditor() {
    ContentPanel panel = new ContentPanel();

    panel.setWidth(400);
    panel.setBodyStyle("padding: 5px;");
    panel.setHeaderVisible(false);

    CssFloatLayoutContainer outer = new CssFloatLayoutContainer();

    nameCombo = new ComboBox<Stock>(stockStore, props.nameLabel());
    nameCombo.setForceSelection(true);
    nameCombo.setTypeAhead(true);
    nameCombo.setName("company");
    nameCombo.setTriggerAction(TriggerAction.ALL);
    nameCombo.setEditable(false);

    nameCombo.addSelectionHandler(new SelectionHandler<Stock>() {

      @Override
      public void onSelection(SelectionEvent<Stock> event) {
        symbol.clearInvalid();
        change.clearInvalid();
        last.clearInvalid();
        lastTrans.clearInvalid();

        stock = event.getSelectedItem();
        driver.edit(stock);
        updateDisplay();
      }
    });

    outer.add(new FieldLabel(nameCombo, "Select Company"), new CssFloatData(1));

    final CssFloatLayoutContainer inner = new CssFloatLayoutContainer();

    name = new TextField();
    name.setAllowBlank(false);

    inner.add(new FieldLabel(name, "Name"), new CssFloatData(1));

    symbol = new TextField();
    symbol.addValidator(new RegExValidator("^[^a-z]+$", "Only uppercase letters allowed"));
    symbol.setAutoValidate(true);
    symbol.setName("symbol");
    inner.add(new FieldLabel(symbol, "Symbol"), new CssFloatData(1));

    last = new DoubleField();
    last.setName("last");
    last.setFormat(NumberFormat.getFormat("0.00"));
    last.setAllowNegative(false);
    last.addValidator(new MinNumberValidator<Double>(0D));
    inner.add(new FieldLabel(last, "Last"), new CssFloatData(1));

    change = new DoubleField();
    change.setName("change");
    change.setFormat(NumberFormat.getFormat("0.00"));
    inner.add(new FieldLabel(change, "Change"), new CssFloatData(1));

    lastTrans = new DateField();
    lastTrans.setName("date");
    lastTrans.setAutoValidate(true);
    inner.add(new FieldLabel(lastTrans, "Updated"), new CssFloatData(1));

    outer.add(inner, new CssFloatData(1));

    TextButton reset = new TextButton("Cancel");
    reset.addSelectHandler(new SelectHandler() {

      @Override
      public void onSelect(SelectEvent event) {
        FormPanelHelper.reset(inner);
        driver.edit(stock);
      }
    });

    panel.addButton(reset);

    TextButton save = new TextButton("Save");
    save.addSelectHandler(new SelectHandler() {

      @Override
      public void onSelect(SelectEvent event) {
        stock = driver.flush();
        if (driver.hasErrors()) {
          new MessageBox("Please correct the errors before saving.").show();
          return;
        }
        updateDisplay();
        stockStore.update(stock);
      }
    });
    panel.addButton(save);

    panel.add(outer);
    return panel;
  }

  private HTML updateDisplay() {
    if (display == null) {
      display = new HTML();
    }
    StockTemplate template = GWT.create(StockTemplate.class);
    display.setHTML(template.drawStock(stock));
    return display;
  }
}

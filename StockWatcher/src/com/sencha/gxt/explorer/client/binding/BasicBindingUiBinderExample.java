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
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.Stock;
import com.sencha.gxt.examples.resources.client.model.StockProperties;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.DateField;
import com.sencha.gxt.widget.core.client.form.DoubleField;
import com.sencha.gxt.widget.core.client.form.FormPanelHelper;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.form.validator.MinNumberValidator;
import com.sencha.gxt.widget.core.client.form.validator.RegExValidator;

@Detail(name = "Basic Binding (UiBinder)", icon = "basicbinding", category = "Binding", files = {
    "BasicBindingExample.html", "BasicBindingUiBinderExample.ui.xml"}, classes = {Stock.class, StockProperties.class})
public class BasicBindingUiBinderExample implements IsWidget, EntryPoint, Editor<Stock> {

  interface MyUiBinder extends UiBinder<FramedPanel, BasicBindingUiBinderExample> {
  }

  interface StockDriver extends SimpleBeanEditorDriver<Stock, BasicBindingUiBinderExample> {
  }

  interface StockTemplate extends XTemplates {
    @XTemplate(source = "BasicBindingExample.html")
    SafeHtml drawStock(Stock stock);
  }

  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  private Stock stock;

  @UiField
  @Ignore
  ComboBox<Stock> scb;

  @UiField
  CssFloatLayoutContainer inner;

  // editor fields
  @UiField
  TextField name;
  @UiField
  TextField symbol;
  @UiField
  DoubleField last;
  @UiField
  DoubleField change;
  @UiField
  DateField lastTrans;

  @UiField
  @Ignore
  HTML display;
  @UiField(provided = true)
  NumberFormat numberFormat = NumberFormat.getFormat("0.00");
  @UiField(provided = true)
  ListStore<Stock> stockStore;

  private StockProperties props = GWT.create(StockProperties.class);
  @UiField(provided = true)
  LabelProvider<Stock> stockLabelProvider = props.nameLabel();

  private StockDriver driver = GWT.create(StockDriver.class);

  private FramedPanel panel;
  
  @UiField
  HorizontalPanel hp;

  public Widget asWidget() {
    if (panel == null) {
      stockStore = new ListStore<Stock>(props.key());
      stockStore.addAll(TestData.getStocks());

      stock = stockStore.get(0);
      
      panel = uiBinder.createAndBindUi(this);

      
      hp.setCellWidth(display, "200");

      last.addValidator(new MinNumberValidator<Double>(0D));

      symbol.addValidator(new RegExValidator("^[^a-z]+$", "Only uppercase letters allowed"));
      symbol.setAutoValidate(true);

      display.setHTML(getUpdatedPanel());
      
      panel.add(hp);

      driver.initialize(this);
      scb.setValue(stock);
      driver.edit(stock);
    }
    return panel;
  }

  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  @UiHandler("scb")
  public void nameComboChange(SelectionEvent<Stock> event) {
    symbol.clearInvalid();
    change.clearInvalid();
    last.clearInvalid();
    lastTrans.clearInvalid();

    stock = event.getSelectedItem();
    driver.edit(stock);
    display.setHTML(getUpdatedPanel());
  }

  @UiHandler("reset")
  public void resetClicked(SelectEvent event) {
    FormPanelHelper.reset(inner);
    driver.edit(stock);
  }

  @UiHandler("save")
  public void saveClicked(SelectEvent event) {
    stock = driver.flush();
    if (driver.hasErrors()) {
      new MessageBox("Please correct the errors before saving.").show();
      return;
    }
    display.setHTML(getUpdatedPanel());
    stockStore.update(stock);
  }

  private SafeHtml getUpdatedPanel() {
    StockTemplate template = GWT.create(StockTemplate.class);
    return template.drawStock(stock);
  }
}

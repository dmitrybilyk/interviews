/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.app.ui;

import java.util.Arrays;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Float;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.BindingPropertySet;
import com.sencha.gxt.core.client.BindingPropertySet.PropertyName;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.state.client.BorderLayoutStateHandler;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.AbstractHtmlLayoutContainer.HtmlData;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.HtmlLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.form.ComboBox;

public class ExplorerShell implements IsWidget {
  private BorderLayoutContainer root = new BorderLayoutContainer();

  public enum Theme {
    BLUE("Blue Theme"), GRAY("Gray Theme"), NEPTUNE("Neptune Theme");

    private final String value;

    private Theme(String value) {
      this.value = value;
    }

    public String value() {
      return value;
    }

    public boolean isActive() {
      ActiveTheme theme = GWT.create(ActiveTheme.class);
      switch (this) {
        case BLUE:
          return theme.isBlue();
        case GRAY:
          return theme.isGray();
        case NEPTUNE:
          return theme.isNeptune();
      }
      return false;
    }

    @Override
    public String toString() {
      return value();
    }
  }

  @PropertyName("gxt.theme")
  public interface ActiveTheme extends BindingPropertySet {
    @PropertyValue(value = "gray", warn = false)
    boolean isGray();
    @PropertyValue(value = "blue", warn = false)
    boolean isBlue();
    @PropertyValue(value = "neptune", warn = false)
    boolean isNeptune();
  }

  public interface Resources extends ClientBundle {
    @NotStrict
    CssResource explorerStyles();

    @Source("hd-bg.gif")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource classicBg();

    @ImageOptions(repeatStyle = RepeatStyle.Both)
    @Source("square.gif")
    ImageResource squareBg();

    @Source("sample-over.gif")
    ImageResource sampleOver();
  }

  @Inject
  public ExplorerShell(ExampleListView listView, ExampleDetailView detailView) {
    Resources res = GWT.create(Resources.class);
    res.explorerStyles().ensureInjected();

    root.setStateful(true);
    root.setStateId("explorerLayout");

    BorderLayoutStateHandler state = new BorderLayoutStateHandler(root);
    state.loadState();

    HtmlLayoutContainer northPanel = new HtmlLayoutContainer("<div><div id='demo-theme'></div><div id=demo-title>Sencha GXT Explorer Demo</div></div>");
    northPanel.setStateful(false);
    northPanel.setId("demo-header");
    northPanel.addStyleName("x-small-editor");

    ListStore<Theme> colors = new ListStore<Theme>(new ModelKeyProvider<Theme>() {

      @Override
      public String getKey(Theme item) {
        return item.name();
      }

    });
    colors.addAll(Arrays.asList(Theme.values()));

    final SimpleContainer con = new SimpleContainer();
    con.getElement().getStyle().setMargin(3, Unit.PX);
    con.setResize(false);

    ComboBox<Theme> combo = new ComboBox<Theme>(colors, new StringLabelProvider<Theme>());
    combo.setTriggerAction(TriggerAction.ALL);
    combo.setForceSelection(true);
    combo.setEditable(false);
    combo.getElement().getStyle().setFloat(Float.RIGHT);
    combo.setWidth(125);
    combo.setValue(Theme.GRAY.isActive() ? Theme.GRAY : Theme.BLUE.isActive() ? Theme.BLUE : Theme.NEPTUNE);
    combo.addSelectionHandler(new SelectionHandler<Theme>() {
      @Override
      public void onSelection(SelectionEvent<Theme> event) {
        switch (event.getSelectedItem()) {
          case BLUE:
            Window.Location.assign(GWT.getHostPageBaseURL() + "explorer-blue.html" + Window.Location.getHash());
            break;
          case GRAY:
            Window.Location.assign(GWT.getHostPageBaseURL() + "explorer-gray.html" + Window.Location.getHash());
            break;
          case NEPTUNE:
            Window.Location.assign(GWT.getHostPageBaseURL() + "index.html" + Window.Location.getHash());
            break;
          default:
            assert false : "Unsupported theme enum";
        }
      }
    });

    con.add(combo);
    northPanel.add(con, new HtmlData("#demo-theme"));

    BorderLayoutData northData = new BorderLayoutData(42);
    root.setNorthWidget(northPanel, northData);

    BorderLayoutData westData = new BorderLayoutData(200);

    westData.setMargins(Theme.NEPTUNE.isActive() ? new Margins(0) : new Margins(5, 0, 5, 5));

    westData.setSplit(true);
    westData.setCollapsible(true);
    westData.setCollapseHidden(true);
    westData.setCollapseMini(true);

    ContentPanel west = new ContentPanel();
    west.setHeadingText("Navigation");
    west.setBodyBorder(true);
    west.add(listView.asWidget());

    MarginData centerData = new MarginData();
    centerData.setMargins(Theme.NEPTUNE.isActive() ? new Margins(0, 0, 0, 8) : new Margins(5));

    SimpleContainer center = new SimpleContainer();
    center.add(detailView.asWidget());

    root.setWestWidget(west, westData);
    root.setCenterWidget(center, centerData);
  }

  @Override
  public Widget asWidget() {
    return root;
  }

  public AcceptsOneWidget getDisplay() {
    return root;
  }

}

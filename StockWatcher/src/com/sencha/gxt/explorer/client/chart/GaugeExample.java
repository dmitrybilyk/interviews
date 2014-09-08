/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.chart;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.chart.client.chart.Chart;
import com.sencha.gxt.chart.client.chart.axis.GaugeAxis;
import com.sencha.gxt.chart.client.chart.series.GaugeSeries;
import com.sencha.gxt.chart.client.draw.Color;
import com.sencha.gxt.chart.client.draw.RGB;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.Data;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.fx.client.easing.BackOut;
import com.sencha.gxt.fx.client.easing.Default;
import com.sencha.gxt.fx.client.easing.EasingFunction;
import com.sencha.gxt.fx.client.easing.ElasticIn;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HorizontalLayoutContainer.HorizontalLayoutData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

@Detail(name = "Gauge Chart", icon = "gaugechart", category = "Charts", classes = Data.class)
public class GaugeExample implements IsWidget, EntryPoint {

  public interface DataPropertyAccess extends PropertyAccess<Data> {
    ValueProvider<Data, Double> data1();

    ValueProvider<Data, Double> data2();

    ValueProvider<Data, Double> data3();

    ValueProvider<Data, Double> data4();

    ValueProvider<Data, String> name();

    @Path("id")
    ModelKeyProvider<Data> nameKey();
  }

  private static final DataPropertyAccess dataAccess = GWT.create(DataPropertyAccess.class);
  private FramedPanel panel;

  @Override
  public Widget asWidget() {
    if (panel == null) {
      final ListStore<Data> store = new ListStore<Data>(dataAccess.nameKey());
      store.addAll(TestData.getData(1, 0, 100));

      final Chart<Data> chart1 = createGauge(store, 0, new RGB("#F49D10"), true, new Default(), dataAccess.data1());

      final Chart<Data> chart2 = createGauge(store, 30, new RGB("#82B525"), false, new Default(), dataAccess.data2());

      final Chart<Data> chart3 = createGauge(store, 80, new RGB("#3AA8CB"), false, new ElasticIn(), dataAccess.data3());

      final Chart<Data> chart4 = createGauge(store, 80, new RGB("#C44598"), true, new BackOut(), dataAccess.data4());

      TextButton regenerate = new TextButton("Reload Data");
      regenerate.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          store.clear();
          store.addAll(TestData.getData(1, 0, 100));
          chart1.redrawChart();
          chart2.redrawChart();
          chart3.redrawChart();
          chart4.redrawChart();
        }
      });

      ToggleButton animation = new ToggleButton("Animate");
      animation.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
        @Override
        public void onValueChange(ValueChangeEvent<Boolean> event) {
          chart1.setAnimated(event.getValue());
          chart2.setAnimated(event.getValue());
          chart3.setAnimated(event.getValue());
          chart4.setAnimated(event.getValue());
        }
      });
      animation.setValue(true, true);

      ToolBar toolBar = new ToolBar();
      toolBar.add(regenerate);
      toolBar.add(animation);

      panel = new FramedPanel();
      panel.setLayoutData(new MarginData(10));
      panel.setCollapsible(true);
      panel.setHeadingText("Gauge Chart");
      panel.setPixelSize(800, 520);
      panel.setBodyBorder(true);

      VerticalLayoutContainer layout = new VerticalLayoutContainer();
      panel.add(layout);

      toolBar.setLayoutData(new VerticalLayoutData(1, -1));
      layout.add(toolBar);

      HorizontalLayoutContainer row1 = new HorizontalLayoutContainer();
      layout.add(row1, new VerticalLayoutData(1.0, 0.5));

      row1.add(chart1, new HorizontalLayoutData(0.5, 1.0));

      row1.add(chart2, new HorizontalLayoutData(0.5, 1.0));

      HorizontalLayoutContainer row2 = new HorizontalLayoutContainer();
      layout.add(row2, new VerticalLayoutData(1.0, 0.5));

      row2.add(chart3, new HorizontalLayoutData(0.5, 1.0));

      row2.add(chart4, new HorizontalLayoutData(0.5, 1.0));
    }

    return panel;
  }

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  private Chart<Data> createGauge(ListStore<Data> store, double donut, Color color, boolean needle,
      EasingFunction easing, ValueProvider<Data, Double> provider) {
    Chart<Data> chart = new Chart<Data>();
    chart.setStore(store);
    chart.setAnimationDuration(750);
    chart.setAnimationEasing(easing);
    chart.setDefaultInsets(25);

    GaugeAxis<Data> axis = new GaugeAxis<Data>();
    axis.setMargin(8);
    axis.setDisplayGrid(true);
    axis.setMinimum(0);
    axis.setMaximum(100);
    chart.addAxis(axis);

    final GaugeSeries<Data> gauge = new GaugeSeries<Data>();
    gauge.addColor(color);
    gauge.addColor(new RGB("#ddd"));
    gauge.setAngleField(provider);
    gauge.setNeedle(needle);
    gauge.setDonut(donut);
    chart.addSeries(gauge);

    return chart;
  }
}

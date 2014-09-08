/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.chart;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor.Path;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.chart.client.chart.Chart;
import com.sencha.gxt.chart.client.chart.RoundNumberProvider;
import com.sencha.gxt.chart.client.chart.series.Primitives;
import com.sencha.gxt.chart.client.chart.series.ScatterSeries;
import com.sencha.gxt.chart.client.chart.series.SeriesLabelConfig;
import com.sencha.gxt.chart.client.chart.series.SeriesRenderer;
import com.sencha.gxt.chart.client.draw.DrawFx;
import com.sencha.gxt.chart.client.draw.HSV;
import com.sencha.gxt.chart.client.draw.RGB;
import com.sencha.gxt.chart.client.draw.sprite.CircleSprite;
import com.sencha.gxt.chart.client.draw.sprite.Sprite;
import com.sencha.gxt.chart.client.draw.sprite.TextSprite;
import com.sencha.gxt.chart.client.draw.sprite.TextSprite.TextAnchor;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.sencha.gxt.examples.resources.client.TestData;
import com.sencha.gxt.examples.resources.client.model.Data;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.fx.client.Draggable;
import com.sencha.gxt.fx.client.animation.Animator;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Resizable;
import com.sencha.gxt.widget.core.client.Resizable.Dir;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToggleButton;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.ActivateEvent;
import com.sencha.gxt.widget.core.client.event.ActivateEvent.ActivateHandler;
import com.sencha.gxt.widget.core.client.event.CollapseEvent;
import com.sencha.gxt.widget.core.client.event.CollapseEvent.CollapseHandler;
import com.sencha.gxt.widget.core.client.event.ExpandEvent;
import com.sencha.gxt.widget.core.client.event.ExpandEvent.ExpandHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.menu.CheckMenuItem;
import com.sencha.gxt.widget.core.client.menu.Item;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuItem;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

@Detail(name = "Scatter Renderer Chart", icon = "scatterrendererchart", category = "Charts", classes = {
    Data.class, DrawFx.class})
public class ScatterRendererExample implements IsWidget, EntryPoint {

  public interface DataPropertyAccess extends PropertyAccess<Data> {
    ValueProvider<Data, Double> data1();

    ValueProvider<Data, Double> data2();

    ValueProvider<Data, Double> data3();

    ValueProvider<Data, String> name();

    @Path("id")
    ModelKeyProvider<Data> nameKey();
  }

  private static final DataPropertyAccess dataAccess = GWT.create(DataPropertyAccess.class);
  private ScatterSeries<Data> series = new ScatterSeries<Data>();
  private ValueProvider<Data, Double> radiusField;
  private ValueProvider<Data, Double> colorField;
  private ValueProvider<Data, Double> grayField;
  private double maxRadius = 50;
  private RGB minColor = new RGB(250, 20, 20);
  private RGB maxColor = new RGB(127, 0, 220);
  private RGB minGray = new RGB(20, 20, 20);
  private RGB maxGray = new RGB(220, 220, 220);
  private ArrayList<RGB> colors = new ArrayList<RGB>();
  private ArrayList<RGB> grays = new ArrayList<RGB>();
  private Chart<Data> chart;
  private FramedPanel panel;

  public Widget asWidget() {
    if (panel == null) {
      // set up colors
      colors.add(new RGB(250, 20, 20));
      colors.add(new RGB(20, 250, 20));
      colors.add(new RGB(20, 20, 250));
      colors.add(new RGB(127, 0, 240));
      colors.add(new RGB(213, 70, 121));
      colors.add(new RGB(44, 153, 201));
      colors.add(new RGB(146, 6, 157));
      colors.add(new RGB(49, 149, 0));
      colors.add(new RGB(249, 153, 0));

      grays.add(new RGB(20, 20, 20));
      grays.add(new RGB(80, 80, 80));
      grays.add(new RGB(120, 120, 120));
      grays.add(new RGB(180, 180, 180));
      grays.add(new RGB(220, 220, 220));
      grays.add(new RGB(250, 250, 250));

      final ListStore<Data> store = new ListStore<Data>(dataAccess.nameKey());
      store.addAll(TestData.getData(12, 0, 100));

      chart = new Chart<Data>();
      chart.setStore(store);
      chart.setDefaultInsets(30);
      chart.setShadowChart(false);

      series.setXField(dataAccess.data1());
      series.setYField(dataAccess.data2());
      Sprite marker = Primitives.circle(0, 0, 20);
      marker.setFill(RGB.BLUE);
      series.setMarkerConfig(marker);
      TextSprite textConfig = new TextSprite();
      textConfig.setFill(new RGB("#333"));
      textConfig.setTextAnchor(TextAnchor.MIDDLE);
      SeriesLabelConfig<Data> labelConfig = new SeriesLabelConfig<Data>();
      labelConfig.setSpriteConfig(textConfig);
      labelConfig.setLabelContrast(true);
      labelConfig.setValueProvider(dataAccess.data3(), new RoundNumberProvider<Double>());
      series.setLabelConfig(labelConfig);
      chart.addSeries(series);

      TextButton regenerate = new TextButton("Reload Data");
      regenerate.addSelectHandler(new SelectHandler() {
        @Override
        public void onSelect(SelectEvent event) {
          store.clear();
          store.addAll(TestData.getData(12, 0, 100));
          chart.redrawChart();
        }
      });

      ToggleButton animation = new ToggleButton("Animate");
      animation.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
        @Override
        public void onValueChange(ValueChangeEvent<Boolean> event) {
          chart.setAnimated(event.getValue());
        }
      });
      animation.setValue(true, true);
      ToggleButton shadow = new ToggleButton("Shadow");
      shadow.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
        @Override
        public void onValueChange(ValueChangeEvent<Boolean> event) {
          chart.setShadowChart(event.getValue());
          chart.redrawChart();
        }
      });
      shadow.setValue(false);

      TextButton xAxis = new TextButton("Select X Axis");
      Menu xAxisMenu = new Menu();
      CheckMenuItem xAxisMenuItem = new CheckMenuItem("data1");
      xAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setXField(dataAccess.data1());
          series.drawSeries();
        }
      });
      xAxisMenuItem.setGroup("x-axis");
      xAxisMenuItem.setChecked(true);
      xAxisMenu.add(xAxisMenuItem);
      xAxisMenuItem = new CheckMenuItem("data2");
      xAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setXField(dataAccess.data2());
          series.drawSeries();
        }
      });
      xAxisMenuItem.setGroup("x-axis");
      xAxisMenu.add(xAxisMenuItem);
      xAxisMenuItem = new CheckMenuItem("data3");
      xAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setXField(dataAccess.data3());
          series.drawSeries();
        }
      });
      xAxisMenuItem.setGroup("x-axis");
      xAxisMenu.add(xAxisMenuItem);
      xAxis.setMenu(xAxisMenu);

      TextButton yAxis = new TextButton("Select Y Axis");
      Menu yAxisMenu = new Menu();
      CheckMenuItem yAxisMenuItem = new CheckMenuItem("data1");
      yAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setYField(dataAccess.data1());
          series.drawSeries();
        }
      });
      yAxisMenuItem.setGroup("y-axis");
      yAxisMenu.add(yAxisMenuItem);
      yAxisMenuItem = new CheckMenuItem("data2");
      yAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setYField(dataAccess.data2());
          series.drawSeries();
        }
      });
      yAxisMenuItem.setGroup("y-axis");
      yAxisMenuItem.setChecked(true);
      yAxisMenu.add(yAxisMenuItem);
      yAxisMenuItem = new CheckMenuItem("data3");
      yAxisMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          series.setYField(dataAccess.data3());
          series.drawSeries();
        }
      });
      yAxisMenuItem.setGroup("y-axis");
      yAxisMenu.add(yAxisMenuItem);
      yAxis.setMenu(yAxisMenu);

      TextButton color = new TextButton("Select Color");
      Menu colorMenu = new Menu();
      CheckMenuItem colorMenuItem = new CheckMenuItem("data1");
      colorMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          colorField = dataAccess.data1();
          grayField = null;
          refresh();
        }
      });
      colorMenuItem.setGroup("color");
      colorMenu.add(colorMenuItem);
      colorMenuItem = new CheckMenuItem("data2");
      colorMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          colorField = dataAccess.data2();
          grayField = null;
          refresh();
        }
      });
      colorMenuItem.setGroup("color");
      colorMenu.add(colorMenuItem);
      colorMenuItem = new CheckMenuItem("data3");
      colorMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          colorField = dataAccess.data3();
          grayField = null;
          refresh();
        }
      });
      colorMenuItem.setGroup("color");
      colorMenu.add(colorMenuItem);
      MenuItem colorFrom = new MenuItem("Color From");
      Menu colorFromMenu = new Menu();
      for (int i = 0; i < colors.size(); i++) {
        final int index = i;
        CheckMenuItem colorFromMenuItem = new CheckMenuItem(colors.get(index).toString());
        colorFromMenuItem.addActivateHandler(new ActivateHandler<Item>() {
          @Override
          public void onActivate(ActivateEvent<Item> event) {
            minColor = colors.get(index);
            refresh();
          }
        });
        colorFromMenuItem.setGroup("colorFrom");
        colorFromMenu.add(colorFromMenuItem);
      }
      colorFrom.setSubMenu(colorFromMenu);
      colorMenu.add(colorFrom);
      MenuItem colorTo = new MenuItem("Color To");
      Menu colorToMenu = new Menu();
      for (int i = 0; i < colors.size(); i++) {
        final int index = i;
        CheckMenuItem colorToMenuItem = new CheckMenuItem(colors.get(index).toString());
        colorToMenuItem.addActivateHandler(new ActivateHandler<Item>() {
          @Override
          public void onActivate(ActivateEvent<Item> event) {
            maxColor = colors.get(index);
            refresh();
          }
        });
        colorToMenuItem.setGroup("colorTo");
        colorToMenu.add(colorToMenuItem);
      }
      colorTo.setSubMenu(colorToMenu);
      colorMenu.add(colorTo);
      color.setMenu(colorMenu);

      TextButton grayscale = new TextButton("Select GrayScale");
      Menu grayMenu = new Menu();
      CheckMenuItem grayMenuItem = new CheckMenuItem("data1");
      grayMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          grayField = dataAccess.data1();
          colorField = null;
          refresh();
        }
      });
      grayMenuItem.setGroup("gray");
      grayMenu.add(grayMenuItem);
      grayMenuItem = new CheckMenuItem("data2");
      grayMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          grayField = dataAccess.data2();
          colorField = null;
          refresh();
        }
      });
      grayMenuItem.setGroup("gray");
      grayMenu.add(grayMenuItem);
      grayMenuItem = new CheckMenuItem("data3");
      grayMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          grayField = dataAccess.data3();
          colorField = null;
          refresh();
        }
      });
      grayMenuItem.setGroup("gray");
      grayMenu.add(grayMenuItem);
      MenuItem grayFrom = new MenuItem("Gray From");
      Menu grayFromMenu = new Menu();
      for (int i = 0; i < grays.size(); i++) {
        final int index = i;
        CheckMenuItem grayFromMenuItem = new CheckMenuItem(grays.get(index).toString());
        grayFromMenuItem.addActivateHandler(new ActivateHandler<Item>() {
          @Override
          public void onActivate(ActivateEvent<Item> event) {
            minGray = grays.get(index);
            refresh();
          }
        });
        grayFromMenuItem.setGroup("grayFrom");
        grayFromMenu.add(grayFromMenuItem);
      }
      grayFrom.setSubMenu(grayFromMenu);
      grayMenu.add(grayFrom);
      MenuItem grayTo = new MenuItem("Gray To");
      Menu grayToMenu = new Menu();
      for (int i = 0; i < grays.size(); i++) {
        final int index = i;
        CheckMenuItem grayToMenuItem = new CheckMenuItem(grays.get(index).toString());
        grayToMenuItem.addActivateHandler(new ActivateHandler<Item>() {
          @Override
          public void onActivate(ActivateEvent<Item> event) {
            maxGray = grays.get(index);
            refresh();
          }
        });
        grayToMenuItem.setGroup("grayTo");
        grayToMenu.add(grayToMenuItem);
      }
      grayTo.setSubMenu(grayToMenu);
      grayMenu.add(grayTo);
      grayscale.setMenu(grayMenu);

      TextButton radius = new TextButton("Select Radius");
      Menu radiusMenu = new Menu();
      CheckMenuItem radiusMenuItem = new CheckMenuItem("data1");
      radiusMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          radiusField = dataAccess.data1();
          refresh();
        }
      });
      radiusMenuItem.setGroup("radius");
      radiusMenu.add(radiusMenuItem);
      radiusMenuItem = new CheckMenuItem("data2");
      radiusMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          radiusField = dataAccess.data2();
          refresh();
        }
      });
      radiusMenuItem.setGroup("radius");
      radiusMenu.add(radiusMenuItem);
      radiusMenuItem = new CheckMenuItem("data3");
      radiusMenuItem.addSelectionHandler(new SelectionHandler<Item>() {
        @Override
        public void onSelection(SelectionEvent<Item> event) {
          radiusField = dataAccess.data3();
          refresh();
        }
      });
      radiusMenuItem.setGroup("radius");
      radiusMenu.add(radiusMenuItem);
      MenuItem maximumRadius = new MenuItem("Max Radius");
      Menu maximumRadiusMenu = new Menu();
      CheckMenuItem maximumRadiusMenuItem = new CheckMenuItem("20");
      maximumRadiusMenuItem.addActivateHandler(new ActivateHandler<Item>() {
        @Override
        public void onActivate(ActivateEvent<Item> event) {
          maxRadius = 20;
          refresh();
        }
      });
      maximumRadiusMenuItem.setGroup("maximumRadius");
      maximumRadiusMenu.add(maximumRadiusMenuItem);
      maximumRadiusMenuItem = new CheckMenuItem("30");
      maximumRadiusMenuItem.addActivateHandler(new ActivateHandler<Item>() {
        @Override
        public void onActivate(ActivateEvent<Item> event) {
          maxRadius = 30;
          refresh();
        }
      });
      maximumRadiusMenuItem.setGroup("maximumRadius");
      maximumRadiusMenu.add(maximumRadiusMenuItem);
      maximumRadiusMenuItem = new CheckMenuItem("40");
      maximumRadiusMenuItem.addActivateHandler(new ActivateHandler<Item>() {
        @Override
        public void onActivate(ActivateEvent<Item> event) {
          maxRadius = 40;
          refresh();
        }
      });
      maximumRadiusMenuItem.setGroup("maximumRadius");
      maximumRadiusMenu.add(maximumRadiusMenuItem);
      maximumRadiusMenuItem = new CheckMenuItem("50");
      maximumRadiusMenuItem.addActivateHandler(new ActivateHandler<Item>() {
        @Override
        public void onActivate(ActivateEvent<Item> event) {
          maxRadius = 50;
          refresh();
        }
      });
      maximumRadiusMenuItem.setGroup("maximumRadius");
      maximumRadiusMenu.add(maximumRadiusMenuItem);
      maximumRadiusMenuItem = new CheckMenuItem("60");
      maximumRadiusMenuItem.addActivateHandler(new ActivateHandler<Item>() {
        @Override
        public void onActivate(ActivateEvent<Item> event) {
          maxRadius = 60;
          refresh();
        }
      });
      maximumRadiusMenuItem.setGroup("maximumRadius");
      maximumRadiusMenu.add(maximumRadiusMenuItem);
      maximumRadius.setSubMenu(maximumRadiusMenu);
      radiusMenu.add(maximumRadius);
      radius.setMenu(radiusMenu);

      panel = new FramedPanel();
      panel.setLayoutData(new MarginData(10));
      panel.setCollapsible(true);
      panel.setHeadingText("Scatter Renderer Chart");
      panel.setPixelSize(620, 500);
      panel.setBodyBorder(true);

      final Resizable resize = new Resizable(panel, Dir.E, Dir.SE, Dir.S);
      resize.setMinHeight(400);
      resize.setMinWidth(400);

      panel.addExpandHandler(new ExpandHandler() {
        @Override
        public void onExpand(ExpandEvent event) {
          resize.setEnabled(true);
        }
      });
      panel.addCollapseHandler(new CollapseHandler() {
        @Override
        public void onCollapse(CollapseEvent event) {
          resize.setEnabled(false);
        }
      });

      new Draggable(panel, panel.getHeader()).setUseProxy(false);

      ToolBar toolBar = new ToolBar();
      toolBar.add(regenerate);
      toolBar.add(animation);
      toolBar.add(shadow);
      toolBar.add(xAxis);
      toolBar.add(yAxis);
      toolBar.add(color);
      toolBar.add(grayscale);
      toolBar.add(radius);

      VerticalLayoutContainer layout = new VerticalLayoutContainer();
      panel.add(layout);

      toolBar.setLayoutData(new VerticalLayoutData(1, -1));
      layout.add(toolBar);

      chart.setLayoutData(new VerticalLayoutData(1, 1));
      layout.add(chart);
    }

    return panel;
  }

  @Override
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

  private SeriesRenderer<Data> color(final ValueProvider<Data, Double> fieldName, final RGB minColor,
      final RGB maxColor, final double minValue, final double maxValue) {
    final HSV min = new HSV(minColor);
    final HSV max = new HSV(maxColor);
    return new SeriesRenderer<Data>() {
      @Override
      public void spriteRenderer(Sprite sprite, int index, ListStore<Data> store) {
        double value = fieldName.getValue(store.get(index));
        double delta1 = delta(minValue, maxValue, min.getHue(), max.getHue(), value);
        double delta2 = delta(minValue, maxValue, min.getSaturation(), max.getSaturation(), value);
        double delta3 = delta(minValue, maxValue, min.getValue(), max.getValue(), value);
        if (chart.isAnimated()) {
          createFillAnimator(sprite, new RGB(new HSV(delta1, delta2, delta3))).run(500);
        } else {
          sprite.setFill(new RGB(new HSV(delta1, delta2, delta3)));
          sprite.redraw();
        }
      }
    };
  }

  private Animator createFillAnimator(final Sprite sprite, RGB color) {
    if (!(sprite.getFill() instanceof RGB)) {
      return null;
    }

    RGB origin = (RGB) sprite.getFill();
    final int originR = origin.getRed();
    final int originG = origin.getGreen();
    final int originB = origin.getBlue();
    final int deltaR = color.getRed() - originR;
    final int deltaG = color.getGreen() - originG;
    final int deltaB = color.getBlue() - originB;

    return new Animator() {
      @Override
      protected void onUpdate(double progress) {
        sprite.setFill(new RGB(originR + (int) (deltaR * progress), originG + (int) (deltaG * progress), originB
            + (int) (deltaB * progress)));
        sprite.redraw();
      }
    };
  }

  private Animator createRadiusAnimator(final CircleSprite sprite, double radius) {
    final double origin = sprite.getRadius();
    final double delta = radius - origin;
    return new Animator() {
      @Override
      protected void onUpdate(double progress) {
        sprite.setRadius(origin + (delta * progress));
        sprite.redraw();
      }
    };
  }

  private double delta(double x, double y, double a, double b, double theta) {
    return a + (b - a) * (y - theta) / (y - x);
  }

  private SeriesRenderer<Data> grayscale(final ValueProvider<Data, Double> fieldName, final RGB minColor,
      final RGB maxColor, final double minValue, final double maxValue) {
    return new SeriesRenderer<Data>() {
      @Override
      public void spriteRenderer(Sprite sprite, int index, ListStore<Data> store) {
        double value = fieldName.getValue(store.get(index));
        double ans = delta(minValue, maxValue, minColor.getGreen(), maxColor.getGreen(), value);
        if (chart.isAnimated()) {
          createFillAnimator(sprite, new RGB((int) Math.round(ans), (int) Math.round(ans), (int) Math.round(ans))).run(
              500);
        } else {
          sprite.setFill(new RGB((int) Math.round(ans), (int) Math.round(ans), (int) Math.round(ans)));
          sprite.redraw();
        }
      }
    };
  }

  private SeriesRenderer<Data> radius(final ValueProvider<Data, Double> fieldName, final double minRadius,
      final double maxRadius, final double minValue, final double maxValue) {
    return new SeriesRenderer<Data>() {
      @Override
      public void spriteRenderer(Sprite sprite, int index, ListStore<Data> store) {
        double scale = delta(maxValue, minValue, maxRadius, minRadius, fieldName.getValue(store.get(index)));
        scale = maxRadius - scale + minRadius;
        if (chart.isAnimated()) {
          createRadiusAnimator((CircleSprite) sprite, scale).run(500);
        } else {
          ((CircleSprite) sprite).setRadius(scale);
          sprite.redraw();
        }
      }
    };
  }

  private void refresh() {

    series.setRenderer(new SeriesRenderer<Data>() {
      @Override
      public void spriteRenderer(Sprite sprite, int index, ListStore<Data> store) {
        if (colorField != null) {
          color(colorField, minColor, maxColor, 0, 100).spriteRenderer(sprite, index, store);
        }
        if (grayField != null) {
          grayscale(grayField, minGray, maxGray, 0, 100).spriteRenderer(sprite, index, store);
        }
        if (radiusField != null) {
          radius(radiusField, 10, maxRadius, 0, 100).spriteRenderer(sprite, index, store);
        }
      }
    });
    if (radiusField != null) {
      series.setShadowRenderer(radius(radiusField, 10, maxRadius, 0, 100));
    }

    series.drawSeries();
  }
}

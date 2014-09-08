/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.sencha.gxt.core.client.XTemplates;
import com.sencha.gxt.examples.resources.client.model.Plant;
import com.sencha.gxt.explorer.client.model.Example.Detail;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.editing.GridEditing;
import com.sencha.gxt.widget.core.client.grid.editing.GridRowEditing;

@Detail(name = "Row Editable Grid", icon = "roweditorgrid", category = "Grid", classes = {AbstractGridEditingExample.class, Plant.class})
public class RowEditingGridExample extends AbstractGridEditingExample {

  public interface PriceTemplate extends XTemplates {
    @XTemplate("<div style='text-align:right;padding:3px'>{value:currency}</div>")
    SafeHtml render(double value);
  }

  @Override
  protected GridEditing<Plant> createGridEditing(Grid<Plant> editableGrid) {
    GridRowEditing<Plant> rowEditing = new GridRowEditing<Plant>(editableGrid);
    ColumnConfig<Plant, Double> price = editableGrid.getColumnModel().getColumn(2);
    rowEditing.addRenderer(price, new AbstractSafeHtmlRenderer<Double>() {
      PriceTemplate template = GWT.create(PriceTemplate.class);
      @Override
      public SafeHtml render(Double object) {
        return template.render(object);
      }
    });
    return rowEditing;
  }

}
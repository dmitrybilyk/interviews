/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.app.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sencha.gxt.explorer.client.app.place.ExamplePlace;

@WithTokenizers({ExamplePlace.Tokenizer.class})
public interface ExplorerPlaceHistoryMapper extends PlaceHistoryMapper {

}

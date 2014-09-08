/**
 * Sencha GXT 3.1.0 - Sencha for GWT
 * Copyright(c) 2007-2014, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package com.sencha.gxt.explorer.client.reader;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.data.shared.loader.JsonReader;
import com.sencha.gxt.data.shared.loader.ListLoadResult;
import com.sencha.gxt.data.shared.loader.ListLoadResultBean;

public class DataRecordJsonReader extends JsonReader<ListLoadResult<DataRecord>, ItemsResult> {

  public DataRecordJsonReader() {
    super(GWT.<SampleAutoBeanFactory> create(SampleAutoBeanFactory.class), ItemsResult.class);
  }

  @Override
  protected ListLoadResult<DataRecord> createReturnData(Object loadConfig, ItemsResult records) {
    return new ListLoadResultBean<DataRecord>(records.getRecords());
  }
}

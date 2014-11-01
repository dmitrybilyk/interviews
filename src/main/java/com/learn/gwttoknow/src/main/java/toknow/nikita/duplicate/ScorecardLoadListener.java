package toknow.nikita.duplicate;

import com.allen_sauer.gwt.log.client.Log;
import com.extjs.gxt.ui.client.data.LoadEvent;
import com.extjs.gxt.ui.client.event.LoadListener;

public class ScorecardLoadListener extends LoadListener {

  /**
   * Fires when an exception occurs during a load operation.
   * 
   * @param le the load event
   */
  public void loaderLoadException(LoadEvent le) {
    Log.error(le.toString(), le.exception);
  }
}

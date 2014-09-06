package stockWatcher.client;

import com.google.gwt.i18n.client.*;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dik81
 * Date: 9/6/14
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public interface StockWatcherMessages extends Messages {
    @DefaultMessage("''{0}'' is not a valid symbol.")
    String invalidSymbol(String symbol);


}

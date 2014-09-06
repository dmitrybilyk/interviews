package stockWatcher.client;

import com.google.gwt.i18n.client.Constants;

/**
 * Created by dik81 on 9/6/14.
 */
public interface StockWatcherConstants extends Constants{
    @DefaultStringValue("StockWatcher")
    String stockWatcher();

    @DefaultStringValue("Symbol")
    String symbol();
    String symbol2();

    @DefaultStringValue("Price")
    String price();

    @DefaultStringValue("Change")
    String change();

    @DefaultStringValue("Remove")
    String remove();

    @DefaultStringValue("Add")
    String add();

    @DefaultStringValue("Nikita's site")
    String nikitasSite();
}

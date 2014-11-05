package toknow.nikita;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.i18n.client.BidiUtils;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import toknow.nikita.duplicate.GuiFactoryImpl;
import toknow.nikita.duplicate.NavigationPanel;
import toknow.nikita.duplicate.NavigationPanelOptions;

/**
 * Created by dik81 on 10/21/14.
 */
public class Duplicate {
  private Viewport viewport;

  public void createViewport() {
//    GuiFactoryImpl.logout();
    viewport = new Viewport();
    BorderLayout borderLayout = new BorderLayout();
    BorderLayoutData borderLayoutData = new BorderLayoutData(Style.LayoutRegion.EAST);

    borderLayoutData.setCollapsible(true);
    borderLayoutData.setMargins(new Margins(2));
    borderLayoutData.setSplit(true);
    borderLayoutData.setSize(218f);
    viewport.setLayout(borderLayout);
//    viewport.add(borderLayout);
//    final NavigationPanelOptions options = new NavigationPanelOptions();
//    createNavigationPanel(viewport, options);
//    viewport.setId(ObjectIds.ROOTPANEL_ID);
    RootPanel.get().clear();
    RootPanel.get().add(viewport);
    RootPanel.get().add(new Label("test label"));
    Window.setTitle("Nikitos");
  }

  private void createNavigationPanel(final Viewport viewport, final NavigationPanelOptions options) {
    //TODO: move initialization to a single place
    final NavigationPanel navigation = GuiFactoryImpl.getInstance().getNavigationPanel(options);
    BorderLayoutData data;
    if (LocaleInfo.getCurrentLocale().getLocaleName().contains("ar")) {
      Scheduler.get().scheduleDeferred(new Command() {
//        @Override
        public void execute() {
          BidiUtils.setDirectionOnElement(navigation.getElement(), HasDirection.Direction.RTL);
        }
      });
      data = new BorderLayoutData(Style.LayoutRegion.EAST);
    } else {
      data = new BorderLayoutData(Style.LayoutRegion.WEST);
    }
    data.setCollapsible(true);
    data.setMargins(new Margins(2));
    data.setSplit(true);
    data.setSize(218f);
    viewport.add(navigation, data);
  }

}

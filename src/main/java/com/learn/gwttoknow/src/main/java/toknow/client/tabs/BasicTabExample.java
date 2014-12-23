package toknow.client.tabs;

//import com.extjs.gxt.samples.resources.client.Resources;
//import com.extjs.gxt.samples.resources.client.TestData;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import toknow.client.testdata.TestData;

import java.util.HashMap;
import java.util.Map;

public class BasicTabExample extends LayoutContainer {  
  
  @Override  
  protected void onRender(Element parent, int pos) {  
    super.onRender(parent, pos);  
    VerticalPanel vp = new VerticalPanel();  
    vp.setSpacing(10);  
  
    String txt = TestData.DUMMY_TEXT_SHORT;

    Map<String, String> interests = new HashMap<String, String>();
    interests.put("football", "Playing with ball by feet");
    interests.put("tennis", "Playing with ball by rachet");
    interests.put("cards", "Playing with cards by hands");

    TabPanel folder = new TabPanel();  
    folder.setWidth(450);  
    folder.setAutoHeight(true);

    for (String interest: interests.keySet()) {
      TabItem tabItem = new TabItem(interest);
      tabItem.addStyleName("pad-text");
      tabItem.addText(interests.get(interest));
      folder.add(tabItem);
    }
  

//    TabPanel panel = new TabPanel();
//    panel.setPlain(true);
//    panel.setSize(450, 250);
//
//    TabItem normal = new TabItem("Normal");
//    normal.addStyleName("pad-text");
//    normal.addText("Just a plain old tab");
//    panel.add(normal);
//
//    TabItem iconTab = new TabItem("Icon Tab");
//    iconTab.setIcon(Resources.ICONS.table());
//    iconTab.addStyleName("pad-text");
//    iconTab.addText("Just a plain old tab with an icon");
//    panel.add(iconTab);
//
//    TabItem ajax1 = new TabItem("Ajax Tab");
//    ajax1.setScrollMode(Scroll.AUTO);
//    ajax1.addStyleName("pad-text");
//    ajax1.setAutoLoad(new RequestBuilder(RequestBuilder.GET, GWT.getHostPageBaseURL() + "data/ajax1.html"));
//    panel.add(ajax1);
//
//    TabItem eventTab = new TabItem("Event Tab");
//    eventTab.addListener(Events.Select, new Listener<ComponentEvent>() {
//      public void handleEvent(ComponentEvent be) {
//        Window.alert("Event Tab Was Selected");
//      }
//    });
//    eventTab.addStyleName("pad-text");
//    eventTab.addText("I am tab 4's content. I also have an event listener attached.");
//    panel.add(eventTab);
//
//    TabItem disabled = new TabItem("Disabled");
//    disabled.setEnabled(false);
//    panel.add(disabled);
//
    vp.add(new Label("Мои интересы!"));
    vp.addStyleName("label-header");
    vp.add(folder);
//    vp.add(panel);
    add(vp);  
  }  
  
}  
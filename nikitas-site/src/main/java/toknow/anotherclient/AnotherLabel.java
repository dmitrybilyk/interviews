package toknow.anotherclient;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;

/**
 * Created by dik81 on 10/18/14.
 */
public class AnotherLabel extends Label{

  public AnotherLabel() {
    addClickHandler(myHandler);
  }

  ClickHandler myHandler = new ClickHandler() {
    public void onClick(ClickEvent event) {
      Window.alert("My behaviour");
    }
  };

  @Override
  public HandlerRegistration addClickHandler(ClickHandler handler) {
    return super.addClickHandler(myHandler);
  }
}

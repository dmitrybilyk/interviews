/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package stockWatcher.client.popup;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.Constants;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;

/**
 * Example file.
 */
public class CwBasicPopup extends SimpleLayoutPanel implements
        HasValueChangeHandlers<String> {
  /**
   * The constants used in this Content Widget.
   */

  /**
   * An instance of the constants.
   */

  /**
   * Constructor.
   */
  public CwBasicPopup() {
  }

  /**
   * Initialize this example.
   */
  public Widget onInitialize() {
    // Create a basic popup widget
    final DecoratedPopupPanel simplePopup = new DecoratedPopupPanel(true);
    simplePopup.ensureDebugId("cwBasicPopup-simplePopup");
    simplePopup.setWidth("150px");
    simplePopup.setWidget(
        new HTML("constants.cwBasicPopupClickOutsideInstructions()"));

    // Create a button to show the popup
    Button openButton = new Button(
        "constants.cwBasicPopupShowButton()", new ClickHandler() {
          public void onClick(ClickEvent event) {
            // Reposition the popup relative to the button
            Widget source = (Widget) event.getSource();
            int left = source.getAbsoluteLeft() + 10;
            int top = source.getAbsoluteTop() + 10;
            simplePopup.setPopupPosition(left, top);

            // Show the popup
            simplePopup.show();
          }
        });

    // Create a popup to show the full size image
    Image jimmyFull = new Image();
    final PopupPanel imagePopup = new PopupPanel(true);
    imagePopup.setAnimationEnabled(true);
    imagePopup.ensureDebugId("cwBasicPopup-imagePopup");
    imagePopup.setWidget(jimmyFull);
    jimmyFull.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        imagePopup.hide();
      }
    });

    // Add an image thumbnail
    Image jimmyThumb = new Image();
    jimmyThumb.ensureDebugId("cwBasicPopup-thumb");
    jimmyThumb.addStyleName("cw-BasicPopup-thumb");
    jimmyThumb.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        imagePopup.center();
      }
    });

    // Add the widgets to a panel
    VerticalPanel vPanel = new VerticalPanel();
    vPanel.setSpacing(5);
    vPanel.add(openButton);
    vPanel.add(new HTML("<br><br><br>" + "constants.cwBasicPopupInstructions()"));
    vPanel.add(jimmyThumb);

    // Return the panel
    return vPanel;
  }

  protected void asyncOnInitialize(final AsyncCallback<Widget> callback) {
    GWT.runAsync(CwBasicPopup.class, new RunAsyncCallback() {

      public void onFailure(Throwable caught) {
        callback.onFailure(caught);
      }

      public void onSuccess() {
        callback.onSuccess(onInitialize());
      }
    });
  }

    @Override
    public HandlerRegistration addValueChangeHandler(ValueChangeHandler<String> handler) {
        Window.alert("check handler");
        return null;
    }
}

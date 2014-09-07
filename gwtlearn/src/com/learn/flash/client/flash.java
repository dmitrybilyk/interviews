package com.learn.flash.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.learn.flash.client.widgets.checkbox.MyCheckBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class flash implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        MyCheckBox myCheckBox = new MyCheckBox();
        RootPanel.get("checkBox").add(myCheckBox.onInitialize());

//        final Button button = new Button("Click me");
//        final Label label = new Label();
//
//        button.addClickHandler(new ClickHandler() {
//            public void onClick(ClickEvent event) {
//                if (label.getText().equals("")) {
//                    flashService.App.getInstance().getMessage("Hello, World!", new MyAsyncCallback(label));
//                } else {
//                    label.setText("");
//                }
//            }
//        });

        // Assume that the host HTML has elements defined whose
        // IDs are "slot1", "slot2".  In a real app, you probably would not want
        // to hard-code IDs.  Instead, you could, for example, search for all
        // elements with a particular CSS class and replace them with widgets.
        //
//        RootPanel.get("slot1").add(button);
//        RootPanel.get("slot2").add(label);
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }
}

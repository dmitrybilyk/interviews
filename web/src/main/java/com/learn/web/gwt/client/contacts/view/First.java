package com.learn.web.gwt.client.contacts.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class First extends Composite{
        interface MyUiBinder extends UiBinder<Widget, First> {}
        private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

        @UiField Label firstLabel;
        @UiField Label secondLabel;
        @UiField Button button;

        public First(String... names) {
                // sets listBox
                initWidget(uiBinder.createAndBindUi(this));
        }

        interface MyStyle extends CssResource {
                String enabled();
                String disabled();
                String redBox();
        }

        void setEnabled(boolean enabled) {
                getElement().addClassName(enabled ? style.enabled() : style.disabled());
                getElement().removeClassName(enabled ? style.disabled() : style.enabled());
        }

        @UiField MyStyle style;

        @UiHandler("button")
        void handleClick(ClickEvent e) {
                Window.alert("Hello, AJAX");
        }
}
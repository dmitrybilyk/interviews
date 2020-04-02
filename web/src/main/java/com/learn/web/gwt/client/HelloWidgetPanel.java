package com.learn.web.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

import java.util.List;

public class HelloWidgetPanel extends Composite {
    interface MyUiBinder extends UiBinder<Widget, HelloWidgetPanel> {}
    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    @UiField
    ListBox listBox;

    public HelloWidgetPanel(List<String> strings) {
        // sets listBox
        initWidget(uiBinder.createAndBindUi(this));
        for (String name : strings) {
            listBox.addItem(name);
        }
    }

    public ListBox getListBox() {
        return listBox;
    }
}
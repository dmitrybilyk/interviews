package com.learn.web.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class DockWidgetPanel extends Widget {
    interface MyUiBinder extends UiBinder<Widget, DockWidgetPanel> {}
    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    public DockWidgetPanel(String... names) {
        // sets listBox
//        initWidget(uiBinder.createAndBindUi(this));

    }

}
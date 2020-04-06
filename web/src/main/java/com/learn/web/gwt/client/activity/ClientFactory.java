package com.learn.web.gwt.client.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.learn.web.gwt.client.activity.ui.GoodbyeView;
import com.learn.web.gwt.client.activity.ui.HelloView;

public interface ClientFactory
{
	EventBus getEventBus();
	PlaceController getPlaceController();
	HelloView getHelloView();
	GoodbyeView getGoodbyeView();
}

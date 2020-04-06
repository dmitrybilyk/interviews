package com.learn.web.gwt.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(MVPModule.class)
public interface MVPInjector extends Ginjector {

  EventBus eventBus();
//
//  ListPresenter listPresenter();

}
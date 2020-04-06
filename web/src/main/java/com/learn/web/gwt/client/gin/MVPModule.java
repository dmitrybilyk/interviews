package com.learn.web.gwt.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.learn.web.gwt.client.LearnGwt;


public class MVPModule extends AbstractGinModule {

//  @Provides
//  @Singleton
//  public HandlerManager getEventBus() {
//    return LearnGwt.eventBus;
//  }

//  @Provides
//  public TestPresenter getTestPresenter() {
//    return new TestPresenter();
//  }

  @Override
  protected void configure() {
    bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    //bind(DetailPresenter.Display.class).to(DetailView.class);
    //bind(ImagePresenter.Display.class).to(ImagePopup.class);
//    install(new GinFactoryModuleBuilder().build());
//    install(new GinFactoryModuleBuilder().build(ImagePresenterFactory.class));
  }

//  public interface ImagePresenterFactory {
//    public ImagePresenter createImagePresenter(ImageResource argImage);
//  }

}
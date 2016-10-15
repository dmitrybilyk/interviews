package com.learn.spring.springevents.customevents;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{
   private SomeObjectInEvent someObjectInEvent;
   
   public CustomEvent(Object source) {
      super(source);
   }

   public SomeObjectInEvent getSomeObjectInEvent() {
      return someObjectInEvent;
   }

   public void setSomeObjectInEvent(SomeObjectInEvent someObjectInEvent) {
      this.someObjectInEvent = someObjectInEvent;
   }

   public String toString(){
      return "My Custom Event";
   }
}
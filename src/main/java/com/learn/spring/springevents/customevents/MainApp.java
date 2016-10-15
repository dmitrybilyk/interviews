package com.learn.spring.springevents.customevents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
      new ClassPathXmlApplicationContext("spring.custom.events/custom-events.xml");

      CustomEventPublisher cvp = 
      (CustomEventPublisher) context.getBean("customEventPublisher");
      cvp.publish();  
      cvp.publish();
   }
}
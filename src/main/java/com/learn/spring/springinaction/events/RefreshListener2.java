package com.learn.spring.springinaction.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RefreshListener2 implements ApplicationListener {
public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof CourseFullEvent) {
        System.out.println(((CourseFullEvent) event).getCourse().getName()+ 7);
    }
}
}
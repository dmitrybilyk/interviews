package com.learn.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 04.07.12
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */

@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
    @Before("within(@com.learn.spring.aop.model.Circle *)")
    public void LoggingAdvice(){
        System.out.println("Advice run. Get method called");
    }
}

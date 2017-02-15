package com.learn.core.annotations.trainings;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAnnotation {
    String author() default "Dmitry";
    String date() default "today";
    int something() default 1;
    String comments();
}
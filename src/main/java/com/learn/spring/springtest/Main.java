package com.learn.spring.springtest;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by IntelliJ IDEA.
 * User: Flash
 * Date: 26.06.12
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
    private static final String START_AT_MINUTES = "03:00";
//    private static final String PERIODICITY = "PT0s";
//    private static final String PERIODICITY = "PT3m";
    private static final String PERIODICITY = "P1D";

    public static void main(String[] args){
//        Triangle triangle = new Triangle();
//        triangle.draw();
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
//        applicationContext.registerShutdownHook();
//        Shape shape = (Shape)applicationContext.getBean("circle");
//        shape.draw();
//        System.out.println(applicationContext.getMessage("greeting", null, "defaultgreeting", null));
//        DateTime currentTime = DateTime.now();
//        DateTime.parse(START_AT_MINUTES, new DateTimeFormatterBuilder()
//                .appendOptional(
//                        new DateTimeFormatterBuilder()
//                        .append(DateTimeFormat
//                                .forPattern("HH:mm"))
//                        .toParser())
//                .appendOptional(
//                        new DateTimeFormatterBuilder()
//                        .append(DateTimeFormat
//                                .forPattern("mm"))
//                        .toParser())
//                .toFormatter())
//                .withFields(currentTime.toLocalDate())
//                .withHourOfDay(currentTime.getHourOfDay());
        java.time.Duration d = java.time.Duration.parse(PERIODICITY);

    }

    public static int someMethod() {
        try{
            throw new Exception();
//        } catch (Exception ex) {
//            return 2;
        }
        finally {
            return 20;
        }
    }
}

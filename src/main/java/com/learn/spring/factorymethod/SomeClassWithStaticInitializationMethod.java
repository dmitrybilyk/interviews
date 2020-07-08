package com.learn.spring.factorymethod;

/**
 * Created by dik81 on 16.02.19.
 */
//factory-method:
//        As everyone has already explained, factory-method is used to tell the spring to use the factory method to instantiate the object.
//
//        Note: static method is mandatory else throws an exception.
//
//<bean id="serviceFactory" class="com.test.controller.ServiceFactory" factory-method="getServiceFacrotyWithStaticMethod"/>
//        factory-bean:
//        When there is no static method and still you want to create the object using non static method, here is the trick can be done using factory-bean:
//
//<bean id="instanceWithOutStaticMethod" factory-bean="serviceFactory" factory-method="getInstanceWithOutStaticMethod" />

public class SomeClassWithStaticInitializationMethod {
    private String name;

    private SomeClassWithStaticInitializationMethod() {

    }

    public static SomeClassWithStaticInitializationMethod getSomeClassInit() {
        return new SomeClassWithStaticInitializationMethod();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

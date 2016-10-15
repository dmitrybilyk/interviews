package com.learn.spring.springlifecycle.initializingDisposableBeantest;

import com.google.common.base.MoreObjects;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by dmitry on 22.01.15.
 */
public class InitializingBeanTest implements InitializingBean, DisposableBean{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", name).add("age", age).toString();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("All properties are set !");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable bean's destroy method works!");
    }
}

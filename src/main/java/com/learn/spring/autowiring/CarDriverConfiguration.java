package com.learn.spring.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarDriverConfiguration {
    @Bean
    public GoodCar goodCar() {
        return new GoodCar(driver());
    }
    @Bean
    public Driver driver() {
        Driver driver = new Driver();
        driver.setName("some conf driver");
        return driver;
    }
}

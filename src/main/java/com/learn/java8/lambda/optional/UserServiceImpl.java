package com.learn.java8.lambda.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by dik81 on 11.01.19.
 */
public class UserServiceImpl {
    List<User> list = Arrays.asList(new User("Dima"), new User("Lena"));
    public Optional<User> getById(Integer id) {
        return list.stream().filter(someUser->someUser.getName().equals("Lena4")).findFirst();
    }

    public String getUserAddress(User user) {
        return Optional.of(user).flatMap(User::getAddress).flatMap(Address::getStreet).orElse("EMPTRY STRING");
    }

//    public Integer getHouseNumber(User user) {
//        return Optional.of(user).flatMap(User::getAddress).flatMap(Address::getHouseNumber).orElse(77);
//    }
}

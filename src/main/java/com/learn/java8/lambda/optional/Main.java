package com.learn.java8.lambda.optional;

import java.util.Optional;

/**
 * Created by dik81 on 11.01.19.
 */
public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User("user with address");
        user.setAddress(Optional.of(new Address(null)));
        System.out.println(userService.getUserAddress(user));

        Optional<User> someUser = Optional.of(new User("new user"));

    }
}

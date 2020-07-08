package com.learn.web.springmvc.controllers;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTry {
        public static void main(String[] args) {

//                Map<String, String> leaderboardGroupsMap = new LinkedHashMap<>();
//                leaderboardGroupsMap.put("1", "Some value");
//                leaderboardGroupsMap.put("3", "And one more");
//                String someValue = "4";
//
//                List<Map.Entry<String, String>> entries = new ArrayList<>(leaderboardGroupsMap.entrySet());
//                leaderboardGroupsMap.clear();
//                entries.stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.naturalOrder()))
//                        .forEachOrdered(e -> leaderboardGroupsMap.put(e.getKey(), e.getValue()));
//
//                String s = "dfd";

                List<User> users = new ArrayList<>();
                users.add(getUser("1", "user1"));
                users.add(getUser("2", "user2"));

                List<String> names = users.stream().map(User::getName).collect(Collectors.toList());



//                System.out.println(map.values().stream().filter(value -> value.equals(someValue)).distinct().findFirst().orElse(null));
        }

        @NotNull private static User getUser(String id, String name) {
                User user = new User();
                user.setName(name);
                user.setId(id);
                return user;
        }
}

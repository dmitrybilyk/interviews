package com.learn.interview_questions.equals_and_hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Dima", "+380504759475");
        Customer customer2 = new Customer(1, "Dima", "+380504759475");
        System.out.println(customer1.equals(customer2));
//
//        List<Customer> customers = new ArrayList<>();
//        customers.add(customer1);
//        System.out.println(customers.contains(customer2));
//        System.out.println(customers.indexOf(customer2));
//        customers.remove(customer2);
//        System.out.println(customers.size());

        Map<Customer, String> customerStringMap = new HashMap<>();
        customerStringMap.put(customer1, "This is the Customer 1");
        System.out.println(customer1.hashCode());
        customer1.setName("Dima1");
        System.out.println(customer1.hashCode());
        customer1.setName("Dima");
        System.out.println(customer1.hashCode());
        System.out.println(customerStringMap.get(customer1));
    }
}

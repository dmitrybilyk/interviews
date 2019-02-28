package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.oderzimost_elementarnimi_tipami;

//import com.sun.corba.se.impl.oa.toa.TOA;

/**
 * Created by Dimon on 05.05.2016.
 */
public class zamena_prostogo_polya_objectom {
//    class Order {
//        // ...
//        private String customer;
//
//        public Order(String customer) {
//            this.customer = customer;
//        }
//        public String getCustomer() {
//            return customer;
//        }
//        public void setCustomer(String customer) {
//            this.customer = customer;
//        }
//    }
//
//    // Client code, which uses Order class.
//    private static int numberOfOrdersFor(Collection orders, String customer) {
//        int result = 0;
//        Iterator iter = orders.iterator();
//        while (iter.hasNext()) {
//            Order each = (Order) iter.next();
//            if (each.getCustomer().equals(customer)) {
//                result++;
//            }
//        }
//        return result;
//    }
//
//    TO
//
//    class Order {
//        // ...
//        private Customer customer;
//
//        public Order(String customerName) {
//            this.customer = new Customer(customerName);
//        }
//        public String getCustomerName() {
//            return customer.getName();
//        }
//        public void setCustomer(String customerName) {
//            this.customer = new Customer(customerName);
//        }
//    }
//
//    class Customer {
//        private final String name;
//
//        public Customer(String name) {
//            this.name = name;
//        }
//        public String getName() {
//            return name;
//        }
//    }
//
//    // Client code, which uses Order class.
//    private static int numberOfOrdersFor(Collection orders, String customer) {
//        int result = 0;
//        Iterator iter = orders.iterator();
//        while (iter.hasNext()) {
//            Order each = (Order) iter.next();
//            if (each.getCustomerName().equals(customer)) {
//                result++;
//            }
//        }
//        return result;
//    }

}

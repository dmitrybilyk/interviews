package com.learn.effectivejava.refactoring.refactoring_guru.narushitely_oo_dezaina.operatori_switch;

/**
 * Created by Dimon on 10.05.2016.
 */
public class null_object {

//    class Company {
//        //…
//        private Customer customer;
//        public Customer getCustomer() {
//            return customer;
//        }
//    }
//
//    class Customer {
//        //…
//        public String getName() {
//            //…
//        }
//        public BillingPlan getPlan() {
//            //…
//        }
//        public PaymentHistory getHistory() {
//            //…
//        }
//    }
//
//    class PaymentHistory {
//        public int getWeeksDelinquentInLastYear() {
//            //…
//        }
//    }
//
//    // Somewhere in client code
//    Customer customer = site.getCustomer();
//    String customerName;
//    if (customer == null) {
//        customerName = "N/A";
//    }
//    else {
//        customerName = customer.getName();
//    }
//
//    //…
//    BillingPlan plan;
//    if (customer == null) {
//        plan = BillingPlan.basic();
//    }
//    else {
//        plan = customer.getPlan();
//    }
//
//    //…
//    int weeksDelinquent;
//    if (customer == null) {
//        weeksDelinquent = 0;
//    }
//    else {
//        weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
//    }
//
//    TO
//
//    class Company {
//        //…
//        private Customer customer;
//        public Customer getCustomer() {
//            return (customer == null) ? Customer.newNull() : customer;
//        }
//    }
//
//    class Customer {
//        //…
//        public boolean isNull() {
//            return false;
//        }
//        public static Customer newNull() {
//            return new NullCustomer();
//        }
//
//        public String getName() {
//            //…
//        }
//        public BillingPlan getPlan() {
//            //…
//        }
//        public PaymentHistory getHistory() {
//            //…
//        }
//    }
//    class NullCustomer extends Customer {
//        @Override public boolean isNull() {
//            return true;
//        }
//        @Override public String getName() {
//            return "N/A";
//        }
//        @Override public BillingPlan getPlan() {
//            return BillingPlan.basic();
//        }
//        @Override public PaymentHistory getHistory() {
//            return PaymentHistory.newNull();
//        }
//    }
//
//    class PaymentHistory {
//        public boolean isNull() {
//            return false;
//        }
//        public static PaymentHistory newNull() {
//            return new NullPaymentHistory();
//        }
//
//        public int getWeeksDelinquentInLastYear() {
//            //…
//        }
//    }
//    class NullPaymentHistory extends PaymentHistory {
//        @Override public boolean isNull() {
//            return true;
//        }
//        @Override public int getWeeksDelinquentInLastYear() {
//            return 0;
//        }
//    }
//
//    // Somewhere in client code
//    Customer customer = site.getCustomer();
//    String customerName = customer.getName();
//
//    //…
//    BillingPlan plan = customer.getPlan();
//
//    //…
//    int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
}

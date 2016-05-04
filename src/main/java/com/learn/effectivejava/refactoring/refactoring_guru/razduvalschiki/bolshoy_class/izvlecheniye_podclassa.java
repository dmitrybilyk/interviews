package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.bolshoy_class;

/**
 * Created by Dimon on 04.05.2016.
 */
public class izvlecheniye_podclassa {
//    class JobItem {
//        private int quantity;
//        private int unitPrice;
//        private Employee employee;
//        private boolean isLabor;
//
//        public JobItem(int quantity, int unitPrice, boolean isLabor, Employee employee) {
//            this.quantity = quantity;
//            this.unitPrice = unitPrice;
//            this.isLabor = isLabor;
//            this.employee = employee;
//        }
//        public int getTotalPrice() {
//            return quantity * getUnitPrice();
//        }
//        public int getQuantity() {
//            return quantity;
//        }
//        public int getUnitPrice() {
//            return (isLabor) ? employee.getRate() : unitPrice;
//        }
//        public Employee getEmployee() {
//            return employee;
//        }
//    }
//
//    class Employee {
//        private int rate;
//        public Employee(int rate) {
//            this.rate = rate;
//        }
//        public int getRate() {
//            return rate;
//        }
//    }
//
//    // Somewhere in client code
//    Employee kent = new Employee(50);
//    JobItem j1 = new JobItem(5, 0, true, kent);
//    JobItem j2 = new JobItem(15, 10, false, null);
//    int total = j1.getTotalPrice() + j2.getTotalPrice();
//
//
//    TO
//
//
//    abstract class JobItem {
//        private int quantity;
//
//        protected JobItem(int quantity) {
//            this.quantity = quantity;
//        }
//        public int getTotalPrice() {
//            return quantity * getUnitPrice();
//        }
//        public int getQuantity() {
//            return quantity;
//        }
//        public abstract int getUnitPrice();
//    }
//
//    class PartsItem extends JobItem {
//        private int unitPrice;
//
//        public PartsItem(int quantity, int unitPrice) {
//            super(quantity);
//            this.unitPrice = unitPrice;
//        }
//        @Override public int getUnitPrice() {
//            return unitPrice;
//        }
//    }
//
//    class LaborItem extends JobItem {
//        private Employee employee;
//
//        public LaborItem(int quantity, Employee employee) {
//            super(quantity);
//            this.employee = employee;
//        }
//        public Employee getEmployee() {
//            return employee;
//        }
//        @Override public int getUnitPrice() {
//            return employee.getRate();
//        }
//    }
//
//    class Employee {
//        private int rate;
//        public Employee(int rate) {
//            this.rate = rate;
//        }
//        public int getRate() {
//            return rate;
//        }
//    }
//
//    // Somewhere in client code
//    Employee kent = new Employee(50);
//    JobItem j1 = new LaborItem(5, kent);
//    JobItem j2 = new PartsItem(15, 10);
//    int total = j1.getTotalPrice() + j2.getTotalPrice();
}

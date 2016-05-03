package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

/**
 * Created by Dimon on 03.05.2016.
 */
//Причины рефакторинга
//        Одинаковые группы параметров зачастую встречаются не в единственном методе.
//        Это приводит к дублированию кода, как самих параметров, так и частых операций над ними.
//        Как только вы сведёте параметры в одном классе, вы сможете переместить туда и методы обработки
//        этих данных, очистив от этого кода другие методы. Лучше внутри класса не добавлять сеттеры, чтобы избежать
//    изменения параметров после передачи
public class zamena_parametrov_objektom {
//    class Account {
//        // ...
//        private Vector transactions = new Vector();
//
//        public double getFlowBetween(Date start, Date end) {
//            double result = 0;
//            Enumeration e = transactions.elements();
//            while (e.hasMoreElements()) {
//                Transaction each = (Transaction) e.nextElement();
//                if (each.getDate().compareTo(start) >= 0 && each.getDate().compareTo(end) <= 0) {
//                    result += each.getValue();
//                }
//            }
//            return result;
//        }
//    }
//
//    class Transaction {
//        private Date chargeDate;
//        private double value;
//
//        public Transaction(double value, Date chargeDate) {
//            this.value = value;
//            this.chargeDate = chargeDate;
//        }
//        public Date getDate() {
//            return chargeDate;
//        }
//        public double getValue() {
//            return value;
//        }
//    }
//
//    // Somewhere in client code…
//    double flow = account.getFlowBetween(startDate, endDate);

//    TO

//    class Account {
//        // ...
//        private Vector transactions = new Vector();
//
//        public double getFlowBetween(DateRange range) {
//            double result = 0;
//            Enumeration e = transactions.elements();
//            while (e.hasMoreElements()) {
//                Transaction each = (Transaction) e.nextElement();
//                if (range.includes(each.getDate())) {
//                    result += each.getValue();
//                }
//            }
//            return result;
//        }
//    }
//
//    class Transaction {
//        private Date chargeDate;
//        private double value;
//
//        public Transaction(double value, Date chargeDate) {
//            this.value = value;
//            this.chargeDate = chargeDate;
//        }
//        public Date getDate() {
//            return chargeDate;
//        }
//        public double getValue() {
//            return value;
//        }
//    }
//
//    class DateRange {
//        private final Date start;
//        private final Date end;
//
//        public DateRange(Date start, Date end) {
//            this.start = start;
//            this.end = end;
//        }
//        public Date getStart() {
//            return start;
//        }
//        public Date getEnd() {
//            return end;
//        }
//        public boolean includes(Date arg) {
//            return arg.compareTo(start) >= 0 && arg.compareTo(end) <= 0;
//        }
//    }
//
//    // Somewhere in client code…
//    double flow = account.getFlowBetween(new DateRange(startDate, endDate));
}

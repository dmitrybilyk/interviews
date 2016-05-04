package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

/**
 * Created by Dimon on 04.05.2016.
 */
public class razbienie_uslovnogo_operatora {
//    class Stadium {
//        // ...
//        public double summerRate;
//        public double winterRate;
//        public double winterServiceCharge;
//
//        public double getTicketPrice(Date date, int quantity) {
//            double charge;
//            if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
//                charge = quantity * winterRate + winterServiceCharge;
//            }
//            else {
//                charge = quantity * summerRate;
//            }
//            return charge;
//        }
//    }

//    TO

//    class Stadium {
//        // ...
//        public double summerRate;
//        public double winterRate;
//        public double winterServiceCharge;
//
//        public double getTicketPrice(Date date, int quantity) {
//            double charge;
//            if (notSummer(date)) {
//                charge = winterCharge(quantity);
//            }
//            else {
//                charge = summerCharge(quantity);
//            }
//            return charge;
//        }
//
//        private boolean notSummer(Date date) {
//            return date.before(SUMMER_START) || date.after(SUMMER_END);
//        }
//        private double winterCharge(int quantity) {
//            return quantity * winterRate + winterServiceCharge;
//        }
//        private double summerCharge(int quantity) {
//            return quantity * summerRate;
//        }
//    }
}

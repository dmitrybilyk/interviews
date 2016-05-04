package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

/**
 * Created by Dimon on 04.05.2016.
 */
//Изоляция длинного метода в собственном классе позволяет остановить бесконтрольный рост метода.
// Кроме того, даёт возможность разделить его на подметоды в рамках своего класса, не засоряя
// служебными методами оригинальный класс.
public class zamena_metoda_objectom_metodov {
//    class Account {
//        // ...
//        int gamma(int inputVal, int quantity, int yearToDate) {
//            int importantValue1 = (inputVal * quantity) + delta();
//            int importantValue2 = (inputVal * yearToDate) + 100;
//            if ((yearToDate - importantValue1) > 100) {
//                importantValue2 -= 20;
//            }
//            int importantValue3 = importantValue2 * 7;
//            // and so on…
//            return importantValue3 - 2 * importantValue1;
//        }
//        // ...
//    }

//    TO

//    class Account {
//        // ...
//        int gamma(int inputVal, int quantity, int yearToDate) {
//            return new Gamma(this, inputVal, quantity, yearToDate).compute();
//        }
//        // ...
//    }
//
//    class Gamma {
//        private final Account account;
//        private int importantValue1;
//        private int importantValue2;
//        private int importantValue3;
//        private int inputVal;
//        private int quantity;
//        private int yearToDate;
//        public Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
//            this.account = source;
//            inputVal = inputValArg;
//            quantity = quantityArg;
//            yearToDate = yearToDateArg;
//        }
//        public int compute() {
//            int importantValue1 = (inputVal * quantity) + account.delta();
//            int importantValue2 = (inputVal * yearToDate) + 100;
//            importantThing();
//            int importantValue3 = importantValue2 * 7;
//            // and so on…
//            return importantValue3 - 2 * importantValue1;
//        }
//        void importantThing() {
//            if ((yearToDate - importantValue1) > 100) {
//                importantValue2 -= 20;
//            }
//        }
//    }
}

package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_slisop_parametrov;

/**
 * Created by Dimon on 07.05.2016.
 */
public class zamena_parametrov_visovom_metoda {
//    class Order {
//        // ...
//        public double getPrice() {
//            int basePrice = quantity * itemPrice;
//            int discountLevel;
//            if (quantity > 100) {
//                discountLevel = 2;
//            }
//            else {
//                discountLevel = 1;
//            }
//            double finalPrice = discountedPrice(basePrice, discountLevel);
//            return finalPrice;
//        }
//        private double discountedPrice(int basePrice, int discountLevel) {
//            if (discountLevel == 2) {
//                return basePrice * 0.1;
//            }
//            else {
//                return basePrice * 0.05;
//            }
//        }
//    }
//
//    TO
//
//    class Order {
//        // ...
//        public double getPrice() {
//            return discountedPrice();
//        }
//        private double discountedPrice() {
//            if (getDiscountLevel() == 2) {
//                return getBasePrice() * 0.1;
//            }
//            else {
//                return getBasePrice() * 0.05;
//            }
//        }
//        private int getDiscountLevel() {
//            if (quantity > 100) {
//                return 2;
//            }
//            else {
//                return 1;
//            }
//        }
//        private double getBasePrice() {
//            return quantity * itemPrice;
//        }
//    }
}

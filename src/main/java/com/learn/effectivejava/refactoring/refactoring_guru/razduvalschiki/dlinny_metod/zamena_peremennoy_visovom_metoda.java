package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.dlinny_metod;

/**
 * Created by Dimon on 03.05.2016.
 */
//Вы помещаете результат какого-то выражения в локальную переменную, чтобы использовать её далее в коде.
//Достоинства
//        Улучшает читабельность кода. Намного проще понять, что делает метод getTax() чем строка orderPrice() * -2.
//        Помогает убрать дублирование кода, если заменяемая строка используется более чем в одном методе.
//    Для начала надо убедиться, что переменным присываются значения только один раз. Для этого объявялем их вака ФАйнал.
//    Если не один раз, то применяем разделение переменной
public class zamena_peremennoy_visovom_metoda {
//    class Product {
//        // ...
//        public double getPrice() {
//            int basePrice = quantity * itemPrice;
//            double discountFactor;
//            if (basePrice > 1000) {
//                discountFactor = 0.95;
//            }
//            else {
//                discountFactor = 0.98;
//            }
//            return basePrice * discountFactor;
//        }
//    }

//    TO

//    class Product {
//        // ...
//        public double getPrice() {
//            return basePrice() * discountFactor();
//        }
//        private int basePrice() {
//            return quantity * itemPrice;
//        }
//        private double discountFactor() {
//            if (basePrice() > 1000) {
//                return 0.95;
//            }
//            else {
//                return 0.98;
//            }
//        }
//    }
}

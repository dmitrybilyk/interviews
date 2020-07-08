package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.bolshoy_class;

/**
 * Created by Dimon on 04.05.2016.
 */

//Достоинства
//        Этот рефакторинг призван помочь в соблюдении принципа единственной обязанности класса.
// Это делает код ваших классов очевиднее и понятнее.
//        Классы с единственной обязанностью более надёжны и устойчивы к изменениям.
// Например, у вас есть класс, отвечающий за десять разных вещей. И когда вам придётся вносить
// в него изменения, вы рискуете при корректировках одной вещи сломать другие.

public class izvlecheniye_classa {
//    class Person {
//        private String name;
//        private String officeAreaCode;
//        private String officeNumber;
//
//        public String getName() {
//            return name;
//        }
//        public String getTelephoneNumber() {
//            return ("(" + officeAreaCode + ") " + officeNumber);
//        }
//        public String getOfficeAreaCode() {
//            return officeAreaCode;
//        }
//        public void setOfficeAreaCode(String arg) {
//            officeAreaCode = arg;
//        }
//        public String getOfficeNumber() {
//            return officeNumber;
//        }
//        public void setOfficeNumber(String arg) {
//            officeNumber = arg;
//        }
//    }
//
//    TO
//
//    class Person {
//        private String name;
//        private TelephoneNumber officeTelephone = new TelephoneNumber();
//
//        public String getName() {
//            return name;
//        }
//        public TelephoneNumber getOfficeTelephone() {
//            return officeTelephone;
//        }
//        public String getTelephoneNumber() {
//            return officeTelephone.getTelephoneNumber();
//        }
//    }
//
//    class TelephoneNumber {
//        private String areaCode;
//        private String number;
//
//        public String getAreaCode() {
//            return areaCode;
//        }
//        public void setAreaCode(String arg) {
//            areaCode = arg;
//        }
//        public String getNumber() {
//            return number;
//        }
//        public void setNumber(String arg) {
//            number = arg;
//        }
//        public String getTelephoneNumber() {
//            return ("(" + areaCode + ") " + number);
//        }
//    }
}

package com.learn.effectivejava.refactoring.refactoring_guru.zamusorivateli.dublirovaniye_coda;

/**
 * Created by Dimon on 13.05.2016.
 */
public class Objedineniye_uslovnyh_operatorov {
//    class Payout {
//        // ...
//
//        public int seniority;
//        public int monthsDisabled;
//        public boolean isPartTime;
//
//        public double disabilityAmount() {
//            if (seniority < 2) {
//                return 0;
//            }
//            if (monthsDisabled > 12) {
//                return 0;
//            }
//            if (isPartTime) {
//                return 0;
//            }
//            // compute the disability amount
//            // ...
//        }
//
//        public double vacationAmount() {
//            if (onVacation()) {
//                if (lengthOfService()
//
//                    TO
//
//                class Payout {
//                    // ...
//
//                    public int seniority;
//                    public int monthsDisabled;
//                    public boolean isPartTime;
//
//                    public double disabilityAmount() {
//                        if (isNotEligibleForDisability()) {
//                            return 0;
//                        }
//                        // compute the disability amount
//                        // ...
//                    }
//                    private boolean isNotEligibleForDisability() {
//                        return seniority < 2 || monthsDisabled > 12 || isPartTime;
//                    }
//
//                    public double vacationAmount() {
//                        return (onVacation() && lengthOfService() > 10) ? 1 : 0.5;
//                    }
//                }
}

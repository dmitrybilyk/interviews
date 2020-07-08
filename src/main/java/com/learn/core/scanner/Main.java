package com.learn.core.scanner;

import java.util.Scanner;

/**
 * Created by dik81 on 25.12.18.
 */
public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");

            int number = sc.nextInt();

            System.out.println("Спасибо! Вы ввели число " + number);

        }
}

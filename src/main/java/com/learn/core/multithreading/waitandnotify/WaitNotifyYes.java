package com.learn.core.multithreading.waitandnotify;

public class WaitNotifyYes {
        public static void main(String[] args) {

                Thread thread = new Thread(new MyRunnable());
                thread.run();
//
//                MyThread myThread = new MyThread();
//                myThread.start();

                Restaurant restaurant = new Restaurant();
                Client client = new Client(restaurant);
                client.start();
                Waiter waiter = new Waiter(restaurant);
                waiter.start();
        }
}

class MyRunnable implements Runnable {

        @Override public void run() {
                System.out.println("dfdf");
        }
}

class MyThread extends Thread {
        @Override public void run() {
                System.out.println("dfdfdf");
        }
}

class Client extends Thread{
        private Restaurant restaurant;
        public Client(Restaurant restaurant) {
                this.restaurant = restaurant;
        }
        @Override
        public void run() {
                for (int i = 0; i < 1000; i++) {
                        restaurant.clientIsEntered();
                }
        }
}

class Waiter extends Thread{
        private Restaurant restaurant;
        public Waiter(Restaurant restaurant) {
                this.restaurant = restaurant;
        }

        @Override
        public void run() {
                for (int i = 0; i < 1000; i++) {
                        restaurant.serveClient();
                }
        }
}

class Restaurant {
        private int availableSeats = 10;
        private void seatIsReleased() {
                availableSeats++;
        }
        private void seatGotBusy() {
                availableSeats--;
        }

        public synchronized void serveClient() {
                while(availableSeats >= 10) {
                        try {
                                wait();
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
                seatIsReleased();
                System.out.println("The client is served, available - " + availableSeats);
                notify();
        }

        public synchronized void clientIsEntered() {
                while(availableSeats < 1) {
                        try {
                                wait();
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
                seatGotBusy();
                System.out.println("The client is entered, available - " + availableSeats);
                notify();
        }
}

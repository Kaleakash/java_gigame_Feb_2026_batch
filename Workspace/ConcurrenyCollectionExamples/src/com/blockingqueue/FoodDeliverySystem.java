package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FoodDeliverySystem {

    public static void main(String[] args) {

        BlockingQueue<String> orders = new ArrayBlockingQueue<>(2);

        // Producer Thread
        Thread customer = new Thread(() -> {

            try {
            	Thread.sleep(4000);
                orders.put("Pizza Order");
                System.out.println("Pizza Order Added");

                orders.put("Burger Order");
                System.out.println("Burger Order Added");

                orders.put("Pasta Order");
                System.out.println("Pasta Order Added");

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread kitchen = new Thread(() -> {

            try {

                Thread.sleep(500);

                System.out.println("\nPreparing: "
                        + orders.take());

                System.out.println("Preparing: "
                        + orders.take());

            } catch (Exception e) {

                e.printStackTrace();
            }
        });

        customer.start();
        kitchen.start();
    }
}

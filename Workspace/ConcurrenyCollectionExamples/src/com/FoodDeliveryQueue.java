package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FoodDeliveryQueue {

    public static void main(String[] args) throws Exception {

       Queue<String> orders =new ConcurrentLinkedQueue<>();
    	 //Queue<String> orders =new LinkedList<>();

        // Customer App Thread
        Thread customerApp = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                orders.offer("Order_" + i);

                System.out.println("Added: Order_" + i);

                try {
                   // Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        });

        // Restaurant Processing Thread
        Thread restaurant = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                try {
                   // Thread.sleep(1000);
                } catch (Exception e) {
                }

                System.out.println("Preparing: "
                        + orders.poll());
            }
        });

        customerApp.start();
        restaurant.start();

        customerApp.join();
        restaurant.join();

        System.out.println("\nRemaining Orders:");
        System.out.println(orders);
    }
}


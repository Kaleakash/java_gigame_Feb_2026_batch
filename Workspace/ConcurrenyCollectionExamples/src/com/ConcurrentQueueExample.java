package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExample {

    public static void main(String[] args) throws Exception {

       // Queue<String> foodOrders = new ConcurrentLinkedQueue<>();
    	 Queue<String> foodOrders = new LinkedList<>();

        // Customer App 1
        Thread app1 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {

                foodOrders.offer("App1_Order_" + i);
            }
        });

        // Customer App 2
        Thread app2 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {

                foodOrders.offer("App2_Order_" + i);
            }
        });

        app1.start();
        app2.start();

        app1.join();
        app2.join();

        System.out.println("Expected Orders: 2000");

        System.out.println("Actual Orders: "
                + foodOrders.size());

        // Kitchen processing order
        System.out.println("\nPreparing Order:");
        System.out.println(foodOrders.poll());

        System.out.println("\nRemaining Queue Size:");
        System.out.println(foodOrders.size());
    }
}


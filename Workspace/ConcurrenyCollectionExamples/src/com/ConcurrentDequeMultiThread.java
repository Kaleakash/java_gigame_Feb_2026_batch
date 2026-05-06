package com;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentDequeMultiThread {

    public static void main(String[] args) throws Exception {

        ConcurrentLinkedDeque<String> tasks =
                new ConcurrentLinkedDeque<>();

        // Thread 1
        Thread developer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {

                tasks.addLast("Normal_Task_" + i);
            }
        });

        // Thread 2
        Thread admin = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                tasks.addFirst("HighPriority_Task_" + i);
            }
        });

        developer.start();
        admin.start();

        developer.join();
        admin.join();

        System.out.println("All Tasks:");
        System.out.println(tasks);

        // Processing tasks
        System.out.println("\nProcessing:");
        System.out.println(tasks.pollFirst());

        System.out.println("\nRemaining Tasks:");
        System.out.println(tasks);
    }
}


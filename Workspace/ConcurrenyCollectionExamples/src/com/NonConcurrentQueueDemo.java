package com;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class NonConcurrentQueueDemo {

    //static Queue<String> queue = new LinkedList<>();
	static Queue<String> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        Runnable producer = () -> {
            for (int i = 1; i <= 10; i++) {
                String event = Thread.currentThread().getName() + "-E" + i;
                queue.offer(event);
                System.out.println("Produced: " + event);
            }
        };

        Runnable consumer = () -> {
            String event;
//            while ((event = queue.poll()) != null) {
//                System.out.println("Consumed: " + event);
//            }
            for (int i = 1; i <= 10; i++) {
                
            	  System.out.println("Consumed: " + queue.poll());
            }
           // System.out.println("Consumed "+queue.poll());
        };
        
        new Thread(consumer, "Consumer-1").start();
        new Thread(producer, "Producer-1").start();
        //new Thread(producer, "Producer-2").start();
        
    }
}




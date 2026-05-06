package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBehaviorExample {

    public static void main(String[] args) throws Exception {

        ArrayBlockingQueue<Integer> queue =
                new ArrayBlockingQueue<>(2);
      //  System.out.println("REmove element "+queue.take());
        queue.put(1);
        queue.put(2);
        System.out.println("Queue size "+queue.size());
        System.out.println("Queue Full");

        // This line waits until space becomes available
        
        Thread.sleep(2000);
        System.out.println("REmove element "+queue.take());
        queue.put(3);

        System.out.println("Added 3");
    }
}


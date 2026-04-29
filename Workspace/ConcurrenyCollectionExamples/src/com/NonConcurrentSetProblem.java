package com;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class NonConcurrentSetProblem {
    public static void main(String[] args) throws Exception {
        //Set<Integer> users = new HashSet<>();
    	CopyOnWriteArraySet<Integer> users = new CopyOnWriteArraySet<Integer>();
        Runnable task = () -> {
            for (int i = 0; i < 50; i++) {
                users.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Total users: " + users.size());
        System.out.println(users);
    }
}


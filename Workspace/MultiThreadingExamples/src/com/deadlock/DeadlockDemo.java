package com.deadlock;

import java.util.concurrent.locks.ReentrantLock;

class ResourceA {}
class ResourceB {}

public class DeadlockDemo {

    public static void main(String[] args) {

        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();
        
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

//        Thread t1 = new Thread(() -> {
//            synchronized (a) {
//                System.out.println("Thread 1 locked A");
//                try { Thread.sleep(100); } catch (Exception e) {}
//                synchronized (b) {
//                    System.out.println("Thread 1 locked B");
//                }
//            }
//        });

        Thread t1 = new Thread(() -> {
        	try {
        		try {
            if(lock1.tryLock()) {
                System.out.println("Thread 1 locked A");
                Thread.sleep(100);
                try {
                if(lock2.tryLock()) {
                    System.out.println("Thread 1 locked B");
                }
                }finally {
					lock2.unlock();
				}
            }
        		}finally {
        			lock1.unlock();
        		}
        	}catch(Exception e) {}
        });
        
        Thread t2 = new Thread(() -> {
            synchronized (a) {
                System.out.println("Thread 2 locked A");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (b) {
                    System.out.println("Thread 2 locked B");
                }
            }
        });

        t1.start();
        t2.start();
    }
}


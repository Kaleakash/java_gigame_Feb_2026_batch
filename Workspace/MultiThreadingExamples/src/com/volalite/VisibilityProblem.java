package com.volalite;

import java.util.concurrent.atomic.AtomicBoolean;

class FlagTask extends Thread {

   //boolean running = true;
	AtomicBoolean running = new AtomicBoolean(true);
    public void run() {
    	int i=0;
        while (running.get()) {
            System.out.println("task running "+i);
            i++;
        }
        System.out.println("Thread stopped");
    }
}

public class VisibilityProblem {

    public static void main(String[] args) throws InterruptedException {

        FlagTask t = new FlagTask();
        t.start();

        Thread.sleep(1000);
        //t.running = false;   // may not be visible
        t.running.set(false);
    }
}


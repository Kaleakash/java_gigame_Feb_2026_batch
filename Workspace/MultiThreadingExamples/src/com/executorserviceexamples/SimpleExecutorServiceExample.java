package com.executorserviceexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread1 implements Runnable {
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	System.out.println(t);
	}
}
class MyThread2 implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		return "Thread running "+t;
	}
}
class MyThread3 extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
public class SimpleExecutorServiceExample {

	public static void main(String[] args) throws Exception{
//		MyThread3 thread3 = new MyThread3();
//		thread3.start();
//		
//		MyThread1 thread1 = new MyThread1();
//		Thread t1 = new Thread(thread1);
//		t1.start();
		
		//MyThread2 thread2 = new MyThread2();
		//Thread t2 = new Thread(thread2);
		
		Runnable rr = new MyThread1();
		
		Executor exe = Executors.newSingleThreadExecutor();
		
		exe.execute(rr);
		
		Callable<String> cc = new MyThread2();
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(rr);		// no return type undefined or null 
		Future<String>ff =  es.submit(cc);	
		System.out.println(ff.get());
		
		
	}

}

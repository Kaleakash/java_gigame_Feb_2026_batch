package com.executorserviceexamples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Thread>{
	@Override
	public Thread call() throws Exception {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		return t;
	}
}
public class ExecutorsMethodExamples {

	public static void main(String[] args) throws Exception{
		Callable<Thread> cc = new Task();
		ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newFixedThreadPool(3);
		//ExecutorService es = Executors.newCachedThreadPool();
		//ExecutorService es = Executors.
		for(int i=0;i<10;i++) {
			 Future<Thread> ff =  es.submit(cc);
			 System.out.println(ff.get());
		}
	}

}

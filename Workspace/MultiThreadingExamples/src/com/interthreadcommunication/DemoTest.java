package com.interthreadcommunication;
class Task implements Runnable {
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(name+" "+i);
				if(name.equals("One") && i==5) {
					wait();		
				}
				if(name.equals("Three") && i==8) {
					//notify();
					wait();
				}
				if(name.equals("Two") && i==3) {
					notifyAll();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class DemoTest {

	public static void main(String[] args) {
		Task tt  = new Task();
		//Task tt1 = new Task();
		Thread t1 = new Thread(tt,"One");
		Thread t2 = new Thread(tt,"Two");
		Thread t3 = new Thread(tt,"Three");
		t1.start();
		t2.start();
		t3.start();

	}

}

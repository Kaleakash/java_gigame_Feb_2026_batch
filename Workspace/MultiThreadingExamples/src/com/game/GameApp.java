package com.game;

class Car implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<=10;i++) {
			System.out.println(name+" "+(50+i)+"Km/hr moving");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class GameApp {

	public static void main(String[] args) throws Exception{
	Car cc = new Car();
	Thread t1 = new Thread(cc);
	Thread t2 = new Thread(cc);
	Thread t3 = new Thread(cc);
	Thread t4 = new Thread(cc);
	System.out.println(t1.getState());
	t1.setName("Car 1");
	t2.setName("Car 2");
	t3.setName("Car 3");
	t4.setName("Car 4");
	System.out.println("Car1 "+t1.isAlive());
	Thread.sleep(1000);
	System.out.println("1...");
	Thread.sleep(1000);
	System.out.println("2...");
	Thread.sleep(1000);
	System.out.println("3...");
	Thread.sleep(1000);
	System.out.println("Game Start");
	t1.start();
	System.out.println(t1.getState());
	t2.start();
	t3.start();
	t4.start();
	System.out.println("Car1 "+t1.isAlive());
	System.out.println(t3.getState());
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	System.out.println(t3.getState());
	System.out.println("Game End");
	}

}

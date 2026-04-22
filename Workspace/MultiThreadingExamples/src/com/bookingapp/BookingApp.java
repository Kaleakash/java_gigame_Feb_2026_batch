package com.bookingapp;

class BookTicket implements Runnable {
	int avl = 3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		
		synchronized (this) {
			
		if(avl>0) {
			System.out.println(name+" got the ticket ");
			avl--;
			//System.out.println("Avl "+avl);
		}else {
			System.out.println(name+" no ticket");
		}
		}
		
	}
}
public class BookingApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTicket bt1 = new BookTicket();	// avl=3	
//		BookTicket bt2 = new BookTicket();	// avl=3
//		BookTicket bt3 = new BookTicket();	// avl=3
//		BookTicket bt4 = new BookTicket();		//avl=3
//		BookTicket bt5 = new BookTicket();		// avl=3
		Thread t1 = new Thread(bt1,"Raj");
		Thread t2 = new Thread(bt1,"Ravi");
		Thread t3 = new Thread(bt1,"Ramesh");
		Thread t4 = new Thread(bt1,"Ram");
		Thread t5 = new Thread(bt1,"Raju");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

package com.extendsexamples;
class A extends Thread{
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("i "+i);
			}
		}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ThreadClassExtendsExamples {

	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();	// thread class reference. 	object is ready 
	obj1.start();		// ready to run ie runnable state 
	obj2.start();
	//obj1.start();
	//obj1 = null;
	}

}

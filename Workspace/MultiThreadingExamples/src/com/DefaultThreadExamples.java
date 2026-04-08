package com;

public class DefaultThreadExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("Demo Thread");
		t.setPriority(1);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(tg);
	}

}

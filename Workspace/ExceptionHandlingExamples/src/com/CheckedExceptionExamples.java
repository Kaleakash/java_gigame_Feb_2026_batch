package com;

public class CheckedExceptionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("Hi");
	}

}

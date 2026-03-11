package com;

public class UnCheckedExceptionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=1;
		try {
		int result = a/b;
		System.out.println("Result is "+result);
		}catch(Exception e) {
			System.out.println("I Take care");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Bye....");
	}

}

package com.bean;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "raj";		
		String str2 = "raj";	// literal style object creation 
					// string pooling 
		String str3 = new String("raj");	// new memory created..
		String str4 = new String("raj");	// new memory created 
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1+" Deep";
//		System.out.println(str1);
//		if(str3.equals(str4)) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
		System.out.println(str1);
		System.out.println(str2);
	}

}

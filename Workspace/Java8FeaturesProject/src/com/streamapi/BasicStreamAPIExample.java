package com.streamapi;

import java.util.ArrayList;
import java.util.List;

public class BasicStreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2);
		ll.add(1);
		ll.add(8);
		ll.add(7);
		System.out.println(ll);
		System.out.println("Retrieve data one by one");
		for(int n : ll) {
			System.out.println(n);
		}
		System.out.println("using for each method");
			ll.forEach(v->System.out.println("value is "+v));
		System.out.println("display using steam concept");
			ll.stream().forEach(v->System.out.println("v is "+v));
		System.out.println("stream with intermediate operation");
		ll.stream().filter(v->v%2==0).forEach(v->System.out.println(v));
	}

}

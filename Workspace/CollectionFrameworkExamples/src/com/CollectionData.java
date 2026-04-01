package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionData {

	public static void main(String[] args) {
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(10);
		ss.add(60);
		ss.add(20);
		ss.add(90);
		System.out.println(ss);
		System.out.println("Retreive element using for each loop");
		for(int n:ss) {
			System.out.println(n);
			ss.remove(10);
		}
		System.out.println("Retreive element using for each loop");
		Iterator<Integer> ii =  ss.iterator();
		while(ii.hasNext()) {
			int n1 = ii.next();
			if(n1==10)
			ii.remove();
			System.out.println(n1);
		}
		System.out.println(ss);
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(60);
		ll.add(20);
		ll.add(90);
		
	}

}

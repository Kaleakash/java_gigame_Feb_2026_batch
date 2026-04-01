package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set ss =new HashSet();
		//Set ss = new LinkedHashSet();
		Set ss =new TreeSet();
		ss.add(2);
		ss.add(1);
		//ss.add("A");
		ss.add(5);
		System.out.println(ss);
	}

}

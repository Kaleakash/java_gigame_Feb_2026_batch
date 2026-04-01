package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Object, String> mm = new HashMap<Object, String>();
		//Map<Object,String> mm = new LinkedHashMap<Object, String>();
		Map<Object, String> mm =new TreeMap<>();
		mm.put(5, "Ravi");
		mm.put(1, "Raj");
		mm.put(4, "Ramesh");
		mm.put(2, "Rajesh");
		//mm.put("a", "b");
		//mm.put(5, "Vikash");
		mm.putIfAbsent(5, "Vikash");
		System.out.println(mm);
	}

}

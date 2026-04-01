package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(3);
		ll.add(1);
		ll.add(6);
		ll.add(2);
		ll.add(9);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}
}

package com;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;
public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
       // Set<Integer> ranks = new HashSet<Integer>();
    	//ConcurrentSkipListSet<Integer> ranks =	new ConcurrentSkipListSet<>();
    	//ConcurrentSkipListSet<Object> ranks = new ConcurrentSkipListSet<Object>();
    	CopyOnWriteArraySet<Object> ranks = new CopyOnWriteArraySet<Object>();
        ranks.add(3);
        ranks.add(1);
        ranks.add(2);
        ranks.add("a");
        for(Object obj : ranks ) {
        	//ranks.add("Hello");
        	ranks.add(4);
        	System.out.println(obj);
        }
        System.out.println("Ranks: " + ranks);
    }
}

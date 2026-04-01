package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorIntermediate {

	public static void main(String[] args) throws Exception{
			   
	    //Vector<Integer> v = new Vector<>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		  // LinkedList<Integer> v = new LinkedList<Integer>();
		      long start = System.nanoTime();
		        Thread t1 = new Thread(() -> {
		            for (int i = 0; i < 1000; i++) v.add(i);
		        });
		        Thread t2 = new Thread(() -> {
		            for (int i = 1000; i < 2000; i++) v.add(i);
		        });
		        long end = System.nanoTime();
		        System.out.println("Time "+(end-start));
		        t1.start();
		        t2.start();
		        t1.join();
		        t2.join();
		        System.out.println(v.size());
		


	}

}

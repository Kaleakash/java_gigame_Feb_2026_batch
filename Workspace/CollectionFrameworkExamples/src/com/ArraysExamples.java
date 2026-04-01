package com;

import java.util.Arrays;
import java.util.List;

public class ArraysExamples {

	public static void main(String[] args) {
		Integer abc[]= {4,1,8,6,5,3};
		System.out.println("Before sort");
		for(int n:abc) {
			System.out.print(n+" ");
		}
		System.out.println();
		Arrays.sort(abc);
		System.out.println("After sort");
		for(int n:abc) {
			System.out.print(n+" ");
		}
		
		List<Integer> ll = Arrays.asList(abc);
		
	}

}

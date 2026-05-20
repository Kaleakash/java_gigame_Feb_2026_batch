package com.streamapi;

import java.util.List;

public class ReduceTerminalOperatoExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		int sum = numbers.stream().reduce(0,(n1,n2)->{
			int sum1=n1+n2;
			System.out.println("sum is "+sum1);
			return sum1;
		});
		System.out.println("sum of natural numbers "+sum);
		
		
	}

}

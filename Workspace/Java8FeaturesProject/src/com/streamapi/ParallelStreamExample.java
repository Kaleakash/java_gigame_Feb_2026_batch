package com.streamapi;

import java.util.List;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("using stream api");
		numbers.stream().forEach(e->System.out.println(e));
		System.out.println("using parallel stream api");
		numbers.parallelStream().forEach(e->System.out.println(e));
		
		long  n = numbers.stream().map(v->{
			System.out.println("Value in map "+v);
			return v+1;
		}).filter(v->
		{boolean result = v%2==0;
		System.out.println("in filter "+result);
		return result;
		}
		).
				
				count();
		System.out.println("Value of n is "+n);
	}

}

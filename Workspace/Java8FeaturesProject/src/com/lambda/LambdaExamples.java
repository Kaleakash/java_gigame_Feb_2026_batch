package com.lambda;

interface Calculator {
	public int add(int x, int y);
}
public class LambdaExamples {

	public static void main(String[] args) {
		Calculator c1 = (x,y)->x+y;
		System.out.println(c1.add(10, 20));
		Calculator c2 = (int x, int y)->x+y;
		System.out.println(c2.add(100, 200));
		Calculator c3 = (a,b)->a+b;
		System.out.println(c3.add(1, 2));
		Calculator c4 = (x,y)-> {
			int sum = x+y;
			return sum;
		};
		System.out.println(c4.add(1000, 2000));
	}

}

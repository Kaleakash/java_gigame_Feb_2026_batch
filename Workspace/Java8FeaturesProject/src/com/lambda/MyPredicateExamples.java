package com.lambda;

import java.util.function.Predicate;

//class MyPredicate implements Predicate<Integer>{
//	@Override
//	public boolean test(Integer t) {
//		// TODO Auto-generated method stub
//		return t>10;
//	}
//}

public class MyPredicateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Predicate<Integer> p1 = new MyPredicate();
//		System.out.println(p1.test(12));
		
		System.out.println("");
		
		Predicate<Integer> p2 = (num)->num>10;
		System.out.println(p2.test(8));
		
		Predicate<String> p3 = (name)->name.length()>5;
		System.out.println(p3.test("RajKumar"));
	}

}

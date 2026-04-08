package com.comarableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ll = new ArrayList<Integer>();
//		ll.add(4);
//		ll.add(1);
//		ll.add(3);
//		ll.add(2);
//		System.out.println("Before sort");
//		System.out.println(ll);
//		Collections.sort(ll);
//		System.out.println("After sort");
//		System.out.println(ll);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Raj", 45000));
		listOfEmp.add(new Employee(1, "Ajay", 25000));
		listOfEmp.add(new Employee(3, "Mahesh", 35000));
		System.out.println("Before sort");
		for(Employee emp:listOfEmp) {
			System.out.println(emp);
		}
		Collections.sort(listOfEmp);
		System.out.println("After sort");
		for(Employee emp:listOfEmp) {
			System.out.println(emp);
		}
	}

}

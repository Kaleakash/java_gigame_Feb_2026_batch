package com.comparableexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Raj", 45000));
		listOfEmp.add(new Employee(1, "Ajay", 25000));
		listOfEmp.add(new Employee(3, "Mahesh", 35000));
		System.out.println("Before sort");
		for(Employee emp:listOfEmp) {
			System.out.println(emp);
		}
		
		//Collections.sort(listOfEmp,new EmployeeSortByIdAsc());
		//Collections.sort(listOfEmp,new EmployeeSortByIdSDesc());
		Collections.sort(listOfEmp,(e1,e2)->(int)(e2.getSalary()-e1.getSalary()));
		System.out.println("After sort");
		for(Employee emp:listOfEmp) {
			System.out.println(emp);
		}
	}

}

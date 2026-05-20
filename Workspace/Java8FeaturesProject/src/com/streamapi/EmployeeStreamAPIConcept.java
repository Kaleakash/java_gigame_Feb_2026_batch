package com.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamAPIConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = List.of(
				new Employee(1, "Raj", 12000),
				new Employee(2, "Ravi", 12000),
				new Employee(3, "Ramesh", 15000),
				new Employee(4, "Rajesh", 19000)
				);
		System.out.println("Stream api with employee objects");
		listOfEmp.stream().forEach(e->System.out.println(e));
		System.out.println("Display employee with some condition");
		listOfEmp.stream().filter(e->e.getSalary()>15000).forEach(e->System.out.println(e));
		
		List<Employee> employeesWithSalaryCondtiion = listOfEmp.stream().filter(e->e.getSalary()>15000).collect(Collectors.toList());
		System.out.println("Number of employees "+employeesWithSalaryCondtiion.size());
		
		Employee maxSalaryEmp =
				listOfEmp.stream()
			           .max((e1, e2) -> 
			                Double.compare(e1.getSalary(), e2.getSalary()))
			           .get();
		System.out.println(maxSalaryEmp);

		Map<Float, List<Employee>> groupBySalary =
				listOfEmp.stream()
			           .collect(Collectors.groupingBy(e -> e.getSalary()));

			System.out.println(groupBySalary);
			
			

	}

}

package com.bean;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
			Employee emp1 = new Employee(100, "Ravi");
			Employee emp2 = new Employee(100, "Ravi");
		Employee emp3 = emp1;	// deep copy 
		
//		Employee emp4 = new Employee(101, "Raj");
//		Employee emp5 = new Employee(101, "Raj");
//		
//		//System.out.println(emp1.getId()+" "+emp1.getName());
//		System.out.println(emp1.equals(emp2));
//		System.out.println(emp1.equals(emp3));
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp3.hashCode());
//		
//		System.out.println(emp4.hashCode());
//		System.out.println(emp5.hashCode());
		emp1.setId(101);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		Employee emp4 = emp1.clone();	// shallow copy 
		System.out.println(emp4);
		emp4.setId(1111);
		System.out.println(emp4);
		System.out.println(emp1);
		emp4=null;
		System.out.println("Hello");
		System.gc();
	}

}

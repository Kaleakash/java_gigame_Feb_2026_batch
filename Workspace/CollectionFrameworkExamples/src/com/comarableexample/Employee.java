package com.comarableexample;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	System.out.println("I came here");
		//return this.id-o.id;  // Asc by Id
	//return o.id-this.id;  // Desc by Id
	//return (int)(this.salary-o.salary); // Asc by Salary
	return this.name.compareTo(o.name); // Asc by Salary
	}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}

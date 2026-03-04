package com.bean;

import java.util.Objects;

public class Employee implements Cloneable{
private int id;
private String name;
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
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return id == other.id && Objects.equals(name, other.name);
}



//@Override
//public String toString() {
//	return "Employee object";
//}

public Employee clone() {
	try {
		Employee emp = (Employee)super.clone();
		return emp;
	} catch (Exception e) {
		System.out.println(e);
		return null;
	}
}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("Before GC");
}


}

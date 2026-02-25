package encapsulation;

public class Employee {
	private String name;
	private float salary;
	public void setValue(String name, float salary) {
		this.name = name;
		//this.salary = salary;
		if(salary<0) {
			this.salary = 8000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println("name is "+name);
		System.out.println("Salary is "+salary);
	}
}

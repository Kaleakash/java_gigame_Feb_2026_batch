package com.lambda;
@FunctionalInterface
interface Hello {
	public String sayHello(String name);
	//public String sayHi(String name);
}
class HelloImp implements Hello {
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Welcome user "+name;
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st Option  creating separate class to provide the body for interface. 
		Hello h1 = new HelloImp();
		System.out.println(h1.sayHello("Raj"));
		// 2nd Option : Anonymous inner class 
		Hello h2 = new Hello() {
			@Override
			public String sayHello(String name) {
				// TODO Auto-generated method stub
				return "Welcome user "+name;
			}
		};
		System.out.println(h2.sayHello("Ajay"));
		// 3rd Option : using lambda expression 
		Hello h3 = (name)->"Welcome user "+name;
		System.out.println(h3.sayHello("Vikash"));
	}

}

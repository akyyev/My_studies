package day43_RevievStaticInstance;

import day44_Inheritance.SuperClass;

public class TestingInheritance extends SuperClass {

	/* 
	protected String printHello() {
		return "Hello";
	}

	*/
	
	void doSomething() {
		temp = 34.0;
		//lastName = "adf";
		
		
		SuperClass obj = new SuperClass();
		//only ID is reachable without extending, because public
		obj.ID = 123456;
		
		
		printHello();
	}
	
	
	public static void main(String[] args) {
		
		TestingInheritance obj = new TestingInheritance();
		SuperClass obj2 = new SuperClass();
		
		String b = obj2.ID+"";
		String a = obj.printHello();
		System.out.println(a);
		
	}
	
}


package day53_Interfaces;



public abstract interface Test{ 
	
	//methods can be one of them (abstract-static-default)
	//access modifier   specifier 		returnType		masterShifuMethodName
	public 				default 		 void 					serdar() {
		
	}
	abstract void method();
	static void method2() {
	}
	
	default void method3() {
		
	}
	public static final int a = 0; //we can remove --> public static final --> it's already set
	int b=5; //even it looks like instance variable it's static variable (as seen in main static method)
	
	
	public static void main(String[] args) {
		System.out.println(a+b);
		//b=7;  //will give error because it's final

	}
	
	
	//Let's try to create constructor, static and instance blocks 
	//--> interfaces can't have a constructor.
	//-->no static blocks(because we can't initialize final static fields)
	
	
	//public Test() {}
	//static {}
	
	
	//Restrictions of abstract methods
	/*
	 * 1. Can't have a body
	 * 2. Can't have private access modifier
	 * 3. Can't have static and final specifiers
	 * 
	 * Must be created in abstract class or in an Interface
	 */
	
	
}

abstract class Practice{
	public abstract void m();  //static methods can't be abstract(because static can't be overridden)
}


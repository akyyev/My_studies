package day40_static_keyword_intance_blocks;

	// warnings are shown because of calling static variables through objects instead of calling through Class name.

public class StaticKeyword {

	int a; 				//instance variables are outside methods, in class. and every object will have it's own copy
						// to access we need to create obj from the class. Otherwise will give compile error.
						// to access non-static variable inside static method creating obj is must.
	
	static int b;		//static variables are outside methods, in class. There is only one copy and but it's shared among all objects.
						// also we can access using class name .b
	
	
	String name;		 // instance variable or field
	
	static String name2; // static variable or class variable 
	
	
	public static void printHello() {   // static method accessible anywhere with className.
		System.out.println("Hello Janym");
		System.out.println("Hello Tokarjam");
	}
	
	public void printSalam() {  // belongs only to this class... 
		System.out.println("Salam janlarym");
	}
	
	
	public static void main(String[] args) {
		
		StaticKeyword obj1 = new StaticKeyword();
		StaticKeyword obj2 = new StaticKeyword();
		
				obj1.a = 5;
				obj2.a = 6;
				//StaticKeyword.a; //will give error, because we are giving reference to static field with non-static field.
				obj1.printSalam(); // accessible after object creation
				printHello(); //accessible without anything in this class.
				
				
		
		System.out.println(obj1.a);  // 5
		System.out.println(obj2.a);  // 6 cuz each has own instance copy
		
		// static variables
				
				obj1.b = 7;
		System.out.println(StaticKeyword.b);  // 7
		System.out.println(obj2.b);  // 7 even if we didn't give value to obj2 it will give the value same, it's shared through all obj.
		
		
		
		StaticKeyword obj3 = new StaticKeyword();
		StaticKeyword obj4 = new StaticKeyword();
		
		obj3.name = "AK";
		obj4.name = "Yunus";
		
		System.out.println(obj3.name);  // AK
		System.out.println(obj4.name);  // Yunus
		
		
		

		StaticKeyword obj5 = new StaticKeyword();
		StaticKeyword obj6 = new StaticKeyword();
		
		obj6.name2 = "Gulshat";
		System.out.println(obj6.name2);  // Gulshat
		
		obj5.name2 = "AKiyev";
		System.out.println(obj6.name2);  // not  Gulshat --> AKiyev... Even obj6 set to Gulshat it will return Akiyev.
		
		
		System.out.println(b);  // both are static fields
		System.out.println(name2);
		
		
		//System.out.println(a);
		//System.out.println(name);
		

	}

}

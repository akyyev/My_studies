package day44_Inheritance;

public class SuperClass2 {

//inheritance is basically a class inherit methods and fields from base class... So we can use those fields on the subclasses...
	

	{
		System.out.println("SuperClass 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		System.out.println(obj.name);
		obj.hello();
	}

	void hello() {
		System.out.println("Salam");
	}
	
}


class A extends SuperClass2{

	//{ System.out.println("SuperClass 2");}   --> inherited from SuperClass2
	// void hello() {System.out.println("Salam");} --> inherited from SuperClass2
	
	String name;

	{
		
		System.out.println("Instance block A");
	}
	
	
	
}

class B extends A{

	//  //{ System.out.println("SuperClass -2 ");} { name = "John";  System.out.println("Instance block A");}  --> inherited from class A and superclass2
	// String name;  --> inherited from class A
	{
		name = "John";
		System.out.println("Instance block B");
	}
	
}


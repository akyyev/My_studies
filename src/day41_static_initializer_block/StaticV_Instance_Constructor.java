package day41_static_initializer_block;

public class StaticV_Instance_Constructor {

	
	//Execution doesn't dependent on object creation
	//As soon as class is loaded it is executed
	//executes ONLY ONCE 
	static {
		System.out.println("Static block\n");
		
	}
	
	
	//Execution dependent on object creation
	//when object is created instance block runs first and then constructor
	{
		System.out.println("Instance block");
	}
	
	//constructor
	//Execution dependent on object creation
	public StaticV_Instance_Constructor() {
		System.out.println("Constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		//objects
		StaticV_Instance_Constructor obj1= new StaticV_Instance_Constructor();
		StaticV_Instance_Constructor obj2= new StaticV_Instance_Constructor();
		
	}

}

package day41_static_initializer_block;

public class InstanceBlock {

	
	{
		//This is an instance block
		// The body of instance block is executed when the object is created from the class.
		// Also it gets executed before the constructor method.
		System.out.println("This is Instance Block-1");
	}
	
	//Another instance block
	{
		System.out.println("This is Instance Block-2");
	}
	
	
	static {
		System.out.println("Static block");
	}
	
	//constructor
	public InstanceBlock() {
		System.out.println("Constructor body");
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("Main method");
		
		
		InstanceBlock obj1 = new InstanceBlock();
		InstanceBlock obj2 = new InstanceBlock();
		
	}

}

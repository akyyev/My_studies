package day41_static_initializer_block;

public class StaticBlock {
	
	
	
	
	//constructor
	public StaticBlock() {
		System.out.println("This is constructor");
	}
	

	public static void concat2Str(String str) {
		System.out.println(str.concat(str));
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		StaticBlock obj1 = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		
		StaticBlock.concat2Str("baho");
		
	}
	
	static {
		System.out.println("static block - 2");
	}
	
	
	static {
		//this block is executed as soon as class is loaded.
		//static block is even executed before the main method
		// we can have multiple static blocks
		//static block execution DOESn't depend on object creation
		System.out.println("hello, static block - 1");	
	}
	
}

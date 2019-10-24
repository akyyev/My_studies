package day40_static_keyword_intance_blocks;

public class Static_Variables_Methods_Practice {

	public static void main(String[] args) {

		
		StaticKeyword.printHello();  // calling static method from different class.
		//StaticKeyword.printSalam();  // printSalam() is non-static
		
		
		StaticKeyword object = new StaticKeyword();
		
		object.printSalam(); //now accessible after creating object from that class.
		
		
		
	}

}

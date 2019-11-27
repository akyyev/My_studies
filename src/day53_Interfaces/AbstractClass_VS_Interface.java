package day53_Interfaces;

public class AbstractClass_VS_Interface {

}

abstract class A{
	
}

interface B{
	
}

/*
 * 				Abstract Class								Interface
 * 
 * 		1. Class extends it							1. Class implements it
 * 		2. Abstract and non abstract methods		2. Only abstract, default, static methods
 * 		3. Any variables							3. Static variables (public static final --> by default)
 * 		4. Instance and static blocks				4. No any blocks
 * 		5. Sub class extends only 1 abstract class	5. A class can implement multiple classes
 * 		6. It's a class								6. It's not class. Blueprint of class
 * 		7. Meant to be extended by subclass			7. Meant to be implemented by regular class
 */

package day58_Exception_Handling;

public class Throws_AND_Throw {

	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException(age + " is not valid age");
			//unreachable codes here ...
		}
		else System.out.println("Your age is "+age+" Welcome to vote...");
	}
	
	
	public static void main(String[] args) {
		
		try {
			validate(12);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught in catch");
		}
		
		validate(19);
		//validate(1);
		
		System.out.println("Rest of code");
	}
}

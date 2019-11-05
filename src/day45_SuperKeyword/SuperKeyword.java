package day45_SuperKeyword;

public class SuperKeyword extends A{


	public SuperKeyword() {
		super(6);
		System.out.println("this is subclass");
		
	}

	public static void main(String[] args) {
		
		SuperKeyword obj = new SuperKeyword();
		obj.name = "abh";
		obj.age = 5;
		obj.price = 10; //price is visible because these are on the same package, otherwise won't be visible
		System.out.println(obj.getPassword());
		
		
	}
	
}


class A{
	
	public String name;
	protected int age;
	double price;
	private int password;
	
	//this is constructor
	public A(int x) {
		this();
		System.out.println("This is super class");
	}

	public A() {
		System.out.println("Default Constructor of class A");
	}
	
	
	
	public int getPassword() {
		return password;
	}
	
	


}

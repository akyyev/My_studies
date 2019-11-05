package day44_Inheritance;


class Data{
	public String name;
	public static int count;
	private String age;
	String ID;
	
	//method
	public void printHello(){
		System.out.println("Hello java");
	}
	
	private void printHola(){
		System.out.println("Hola");
	}
	
	void printSalam(){
		System.out.println("Salam!");
		//but I can call printHola() in here because they are in same class
		printHola();
	}
	
	
	
	//static block is executed when object is created
	{
		count++;
	}
	
}

public class MultiClassPractice {

	public static void main(String[] args) {
		Data obj = new Data();
		
		System.out.println(obj.name); // public
		//System.out.println(obj.age); //private
		System.out.println(obj.ID); //default access modifier is visible to the classes are in the same package
		
		
		Data obj2 = new Data();
		Data obj3 = new Data();
		Data obj4 = new Data();
		Data obj5 = new Data();
		
		
		System.out.println(Data.count+" objects are created");
		
		
		obj.printHello();
		obj.printSalam();
		// obj.printHola();  // private...
		
	}
}

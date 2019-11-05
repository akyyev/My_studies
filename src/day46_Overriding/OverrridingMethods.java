package day46_Overriding;

public class OverrridingMethods {

	
	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.move(); //overridden method
		d1.eat(); //inherited method
		d1.bark(); // method on it's class
		d1.sleep("gaplang");
	
		
		System.out.println("--------------");
		
		Animal d2 = new Animal();
		d2.eat();
		d2.move();

		
		System.out.println(d1.getNum());
	}
	

}


class Animal {
	
	{
		num++;
	}
	
	public static int num=0;
	
	public static int getNum() {
		return num;
	}
	
	public void move() {
		System.out.println("Moving..."); 
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping.zzzz");
	}
	public void sleep(String s) { //overloading method
		System.out.println(s+" is sleeping....");
	}
}


class Dog extends Animal{
	
	
	
	@Override
	public void move() {
		System.out.println("Dog is moving");
	}
	
	//@Override
	public void bark() {
		System.out.println("woof woof...");
	}
	
	@Override
	public void sleep() {
		System.out.println("dog is sleeping");
	}
}


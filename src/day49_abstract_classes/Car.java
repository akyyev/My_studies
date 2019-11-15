package day49_abstract_classes;

abstract class AbstractClass{
	
	abstract void m();
	abstract void m(int x);
	
	void Hello() {
		System.out.println("Hellooooo");
	}
}

class Toyota extends AbstractClass{

	@Override
	void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m(int x) {
		// TODO Auto-generated method stub
		
	}
	
	void readAdd() {
		System.out.println("Best car is toyota");
	}
}


public class Car extends AbstractClass{

	@Override
	void m(int x) {
		System.out.println("some method"+x+x);
	}
	@Override
	void m() {
		System.out.println("method without parameter");
	}
	@Override
	void Hello() {
		System.out.println("Salam");
	}
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.Hello();
		c1.m();
		c1.m(3);
		
		
		AbstractClass c2 = new Car();
		c2.Hello(); //Tried to invoke Hello method from AbstractClass but it's invoking method from Car class
		
		
		System.out.println("-----------");
		
		Toyota c3 = new Toyota();
		c3.Hello(); //Hello method is invoked by subclass, inheritance
		c3.readAdd(); //instance method
		
		
		
	}
	
}





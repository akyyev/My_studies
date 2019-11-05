package day47_abstract_classes;

abstract class Shape {
	// making abstract will allow you to ignore the implementations
	//abstract cannot be final
	
	abstract public void area();
	abstract public void perimeter();
	abstract public void volume();
}

abstract class Rectangle extends Shape{
	//	abstract public void area();  			//are inherited from Shape class
	//	abstract public void perimeter();
	//	abstract public void volume();
	abstract public void base();
}

//concrete
class Triangle extends Shape {
	
	@Override
	public void area() {
		System.out.println("volume of triangle is a*b/2");
	}

	@Override
	public void perimeter() {
		System.out.println("perimeter of triangle is 2*(a+b)");
	}

	@Override
	public void volume() {
		System.out.println("volume of triangle is a*b*c");
	}

}

public class Practice {
}

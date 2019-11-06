package day49_abstract_classes;

import java.text.DecimalFormat;

public abstract class Shape {

	protected double height;
	protected String name;
	protected final double PI =  Math.PI;
	protected double baseArea;
	protected double basePerimeter;
	
	abstract public double getArea();
	abstract public double getVolume();
	abstract public double getPerimeter();
	
	DecimalFormat df = new DecimalFormat("0.0");
	
	public String toString() {
		return "Name: " + this.name + "\t Area: "+ df.format(this.getArea())+ 
				"\t Perimeter: "+df.format(this.getPerimeter())+ "\t Volume: "+ df.format(this.getVolume());
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("This program calculates area, volume and perimeter of shapes\n");
		
		
		Square obj = new Square(5);
		Rectangle obj2 = new Rectangle(10,20);
		Cylinder obj3 = new Cylinder(10,2); 
		Circle obj4 = new Circle(10); // area = 314  perimeter = 62.8   volume = 0;
		Shape obj5 = new RectangularPrism(10,20,30);
		
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
	}
}

class RectangularPrism extends Shape{
	
	
	private double length;
	private double width;
	
	public RectangularPrism(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.name = "Prism";
		baseArea = this.length*this.width;
		basePerimeter = 2*(this.length+this.width);
	}
	
	@Override
	public double getArea() {
		return 2*baseArea+height*basePerimeter;
	}
	@Override
	public double getVolume() {
		return baseArea*height;
	}
	
	@Override
	public double getPerimeter() {
		return 2*basePerimeter+4*height;
	}
	
	
	
	
}




class Rectangle extends RectangularPrism{
	
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super(length, width, 0);
		this.name = "Rectangle";
	}
	
	@Override
	public double getArea() {
		return this.baseArea;
	}
	@Override
	public double getVolume() {
		return super.getVolume();
	}
	
	@Override
	public double getPerimeter() {
		return this.basePerimeter;
	}
	
	
}

class Square extends Rectangle{
	
	public Square(double sidelength) {
		super(sidelength, sidelength);
		this.name = "Square";
	}
	
}

class Cylinder extends Shape{
	
	protected double radius;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.name = "Cylinder";
		this.height = height;
		baseArea = PI*Math.pow(radius,2);
		basePerimeter = 2*PI*radius;
	}
	@Override
	public double getArea() {
		return this.baseArea+this.basePerimeter*height;
	}
	@Override
	public double getVolume() {
		return baseArea*height;
	}
	@Override
	public double getPerimeter() {
		return 2*basePerimeter+2*height;
	}
	
}

class Circle extends Cylinder{
	
	
	public Circle(double radius) {
		super(radius,0);
		this.name = "Circle";
	}
	
	@Override
	public double getArea() {
		return this.baseArea;
	}
	
	@Override
	public double getPerimeter() {
		return this.basePerimeter;
	}
	
}






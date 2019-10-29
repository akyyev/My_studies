package day43_RevievStaticInstance;

public class Rectangle {

	private double length;
	private double height;
	
	private double area;
	
	
	public void setLength(double length) {
		this.length=length;
		setArea();
	}
	public void setHeight(double height) {
		this.height = height;
		setArea();

	}
	
	private void setArea() {
		area = length*height;
	}
	
	public double getArea() {
		return area;
	}
	
	
}

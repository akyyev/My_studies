package day37_oop;

class Car {

	String model;
	String brand;
	int year;
	String color;
	double price;
	int mileage;
	String VIN;
	
	public Car() {
		
	}
	
	public Car(String m, String b, int year, String color, double price, int mileage, String vin) {
		this.brand=b;
		this.model=m;
		this.year=year;
		this.color=color;
		this.price=price;
		this.mileage=mileage;
		this.VIN = vin;
	}
	
	/*
	 instance variable/object variable ==> variables are in the class, outside methods
	 
	 method variable
	 
	 
	  car attributes : 
	  			model, year, color, price, mileage, vin
	  			
  	  Actions : 
  	  			start, drive, accelerate, stop, drift, brake, get_ticket
	 */
	
	
	public void drive() {
		System.out.println("Driving "+ brand);
	}
	
	public void start() {
		System.out.println(brand + " is started");
	}
	
	public void accelerate() {
		System.out.println(brand +" is accelerating, wroom wroom");
	}
	
	public void stop() {
		System.out.println(brand +" is stopped");
	}
	
	public String toString() {
		return brand+" "+model + " " + year +" "+ color+", "+mileage+ " miles "+ VIN+" $" +(int)price;
	}
	
}

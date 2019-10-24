package day37_oop;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		car1.brand = "Toyota";
		car1.model = "Camry";
		car1.color = "Green";
		car1.mileage = 124000;
		car1.price = 7000;
		car1.VIN = "12351XEQ534POREP";
		car1.year = 2010;
		
		
		
		car1.drive();
		car1.accelerate();
		System.out.println(car1);
		
		
		Car car2 = new Car("X5", "BMW", 2015, "White", 13000, 30000, "NMW32421X423BN");
		
		
		System.out.println(car2);
	}
	

}

package day56_TypeCasting;

public class TypeCasting {
	
	/*
	 * Upcasting (Generalization or Widening) is casting to a parent type 
	 * in simple words casting individual type to one common type is called 
	 * upcasting while downcasting (specialization or narrowing) is casting 
	 * to a child type or casting common type to individual type.
	 */


	//Food-->Fruit-->Apple, Orange
	public static void main(String[] args) {
	
		Fruit fruit = new Apple();
		Apple castedApple = (Apple) fruit;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


//Food is the interface which is at the topmost level
interface Food{
	public float getTotalCalories();
	public String getOrigin();
}

//Fruit is abstract class
abstract class Fruit implements Food{
	public float getTotalCalories() {
		return .5f;
	}
	public void getColor() {
		System.out.println("someColor");
	}
}

//Apple and Orange are two concrete sub classes
class Apple extends Fruit{

	@Override
	public float getTotalCalories() {
		return .4f;
	}
	
	@Override
	public String getOrigin() {
		
		return "someCity";
	}
	
	public void getColor() {
		System.out.println("green apple");
	}
}
class Orange extends Fruit{

	@Override
	public String getOrigin() {
		return "someOtherCity";
	}
	@Override
	public float getTotalCalories() {
		return .3f;
	}
}









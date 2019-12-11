package day59_Exception_Handling_Review;

public class Review {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		sleep(); // we need to handle again wherever we use it
		
		
		try {
			System.out.println("test try block");
			System.out.println(6/0); // throws exception but handled in catch block 
			System.out.println("Is it reachable?"); //no reachable
		} catch(ArithmeticException e) {
			e.printStackTrace(); // prints exception reason but will execute rest of codes
			System.out.println("catch block");
			int[] a= {1,3};
			//System.out.println(a[20]);
			//System.out.println("after outOfBound is reachable");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("second catch block");
		}
		
		
		int num = 9;
		
		if(num<10) throw new ArithmeticException();
		else System.out.println("Number is over 10");
		
	}
	
	
	public static void sleep() throws InterruptedException{
		Thread.sleep(500);
	}

}

package day42_encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AccessModifiers obj = new AccessModifiers();
		obj.height = 60;
		//obj.name = "John"; //Not visible Because it's private.
		//So we get and change name
		
		System.out.println("Name: "+obj.getName());
		
		obj.setName("Dante");
		System.out.println("Name: "+obj.getName());
		
		
		AccessModifiers.testing2 = 9;
		
	}

}

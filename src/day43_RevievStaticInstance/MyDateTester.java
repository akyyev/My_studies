package day43_RevievStaticInstance;

public class MyDateTester {

	public static void main(String[] args) {
		
		
		MyDate d1 = new MyDate(2,28,2012);
		MyDate d2 = new MyDate(1, 2, 2012);
		MyDate d3 = new MyDate(5, 29, 2020);
		
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d3.nextDay());
	}

}

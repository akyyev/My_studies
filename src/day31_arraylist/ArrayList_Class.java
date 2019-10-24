package day31_arraylist;

import java.util.ArrayList;


public class ArrayList_Class {
	
	public int numbers;
	public double price;

	public ArrayList_Class(int num, double price) {
		
		System.out.println("Object created");
		this.numbers= num;
		this.price = price;
	}
	
	public ArrayList_Class() {
		
	}
	
	
	public double getPrice() {
		return numbers*price;
	}
	
	public static void main(String[] args) {
		//created interface, just for learning
		
		
		ArrayList_Class obj = new ArrayList_Class(2, 4);
		
		System.out.println(obj.getPrice());
		
		
		Square s = (int x) -> x * x;
		System.out.println(s.calculate(5));
		
		
		ArrayList<String> strList = new ArrayList<>();
		
		
		strList.add("Bagtyyar");
		strList.add("Gulshat");
		strList.add("Yunus");
		
		System.out.println(strList.get(1));
		
		
		strList.add(1, "Asym");
		System.out.println(strList.get(1));
		
		
		strList.add(1, "Ayshe");
		System.out.println(strList.get(1));
		
		String a = "ba";
		boolean b= a.contentEquals("ba");
		System.out.println(b);
		
		System.out.println(strList);
		
		
	}
	

}



interface Square {
	int calculate(int x);
}

 class A extends ArrayList_Class{

	public A(int num, double price) {
		super(num, price);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

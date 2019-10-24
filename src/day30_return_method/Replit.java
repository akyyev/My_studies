package day30_return_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Replit{
	
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(byte i) {
		System.out.println(i);
	}
	public static void print(boolean i) {
		System.out.println(i);
	}
	public static void print(long i) {
		System.out.println(i);
	}
	public static void print(double i) {
		System.out.println(i);
	}
	public static void print(String i) {
		System.out.println(i);
	}
	public static void print(String[] i) {
		System.out.println(i);
	}
	public static void print(int[] i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		short a1  = Short.parseShort("2312");
		System.out.println(a1);
		
		
		
		
		int a = 6;
		Integer b = 1000000000;
		
		int max = Integer.MAX_VALUE;
		
		System.out.println("MAX +1 "+(max+1));
		
		int k = Integer.MIN_VALUE;
		
		print(k);
		
	int[] arr = {1,2,3,4,5,6};
		
	print(arr);
		
		System.out.println(a==b);
		
		ArrayList<Integer>  intList = new ArrayList<>();
		
		intList.add(intList.size(), 1212);
		
		System.out.println(intList);
		intList.add(4); //auto-boxing
		intList.add(78);
		intList.add(0, 5);
		intList.add(1,100);
		
		System.out.println(intList);
		
		
		
		ArrayList<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter a name: ");
			String name = sc.nextLine();
			names.add(name);
	
			
			System.out.print("Do you want to add another? ");
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("no")) break;
			else if(!(ans.equalsIgnoreCase("yes"))) {
				System.out.println("invalid");
				break;
			}
			
			
		}
		
		sc.close();
		Collections.sort(names);
		
		System.out.println(names);
	}
}
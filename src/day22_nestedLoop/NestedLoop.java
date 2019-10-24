package day22_nestedLoop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//makeTriangle();
		
		
		//makeTriangleWithWhileLoop();
		//makeTriangle3();
	
		
		calc();
	}
	
	public static void makeTriangle() {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void makeTriangleWithWhileLoop() {
		
		int i=1;
		while(i<=10) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void makeTriangle3() {
		
		for(int i=10; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void calc() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
	
		
		
		System.out.println("Select an operation you want: +, -, *, /");
		String operation = s.next();
		
		System.out.println("Enter first and second number: ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		int result=0;
		
		if(operation.equals("+")) result = a+b;
		if(operation.equals("-")) result = a-b;
		if(operation.equals("*")) result = a*b;
		if(operation.equals("/")) result = a/b;
		
		System.out.println(result);
		
		System.out.println("Do you want to continue?");
		String ans = s.next();
		if(ans.equals("no")) break;
		
		}
		
		
	}

}

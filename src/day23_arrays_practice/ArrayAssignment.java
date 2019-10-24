package day23_arrays_practice;

import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		threeChars();
	}
	
	
	public static void threeChars() {
		
		Scanner s = new Scanner(System.in);
		
		String[] wordArray = new String[5];
		
		System.out.println("Type 5 words: ");
		
		System.out.println("-------------------");
		
		for(int i=0; i<5; i++) {
			System.out.print("words "+(i+1)+": ");
			
			wordArray[i] = s.nextLine();
			
		}
		
		System.out.println("-------------------");
		
		for(int i=0; i<5; i++) {
			
			System.out.println(wordArray[i].substring(0,3));
			
			
		}
		
		
		
		
		
		
	}

}

package day15_assignment;

import java.util.Scanner;

public class startEndWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Write a program StartEndWords: you have 2 words that must be 5 characters,
		 and check if last letter of first word and first letter of second work are
		 same. if either one not 5 chars length: print
		 "need to be exactly 5 chars length" if last letter of 1st word and first
		 letter of 2nd word match: print "Fizz" if they do not match: print
		 "Buzz - did not match"
		 */
		
		Scanner s = new Scanner(System.in);

		int a, b;

		System.out.println("Give me 2 words each are 5 characters, I will compare the first and last characters");
		String str1=s.next(), 
				str2=s.next();
		
		
		a = str1.length();
		b = str2.length();

		if (!(a == 5 && b == 5)) System.out.println("Need to be exactly 5 chars length");
		else if((str1.charAt(a-1)+"").equals(str2.charAt(0)+"")) System.out.println("Fizzzzzzzz");
		else System.out.println("Buzzzzz - did not match");
		

		s.close();
	}

}

package day15_assignment;

import java.util.Scanner;

public class duplicateIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Ask user to enter two words. Print the first word, second word, second word, first word
		Input:
		one
		two
		Output:
					onetwotwoone
		 */
		Scanner s = new Scanner(System.in);

		String a, b;

		System.out.println("Give me 2 words, I will duplicate it");
		a = s.next();
		b = s.next();
		

		System.out.println(a+b+b+a);

		s.close();
	}

}

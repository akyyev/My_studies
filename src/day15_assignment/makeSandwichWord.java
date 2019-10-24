package day15_assignment;

import java.util.Scanner;

public class makeSandwichWord {

	public static void main(String[] args) {
		/*
			 Ask user to enter two words. If the first word has even number of characters, 
			 print the first half of the first word,
			  print the second word and print the second half of the first word.
			
			Input:
					banana
					apple
			Output:
					banappleana
		 */
		
		Scanner s = new Scanner(System.in);

		String a, b;

		System.out.println("Give me 2 words, I will make sandwich by putting\n second word in the middle of first word");
		a = s.next();
		b = s.next();
		
								//first half of 1st word	2nd word		Second half of 2nd word
		System.out.println(    (a.substring(0,a.length()/2)).concat(b).concat(a.substring(a.length()/2))     );

		s.close();

		
		
	}

}

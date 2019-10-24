package day15_assignment;

import java.util.Scanner;

public class makeThemEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Ask user to enter two words. If they are equal length, print them together. 
		 If one is longer than the other one, print equal number of characters from the long one.

			Input:	book
					pen
			Output:
					boopen
		 */
		
		Scanner s = new Scanner(System.in);

		String a, b, together;

		System.out.println("Give me 2 words, I will make them equal");
		a = s.next();
		b = s.next();
	
		if(a.length()==b.length())  together=a+b;
		else if(a.length()>b.length()) together = a.substring(0,b.length())+b;
		else together = a+b.substring(0,a.length());
		
		System.out.println(together);
		
		s.close();
		
		String reversed = "";
		
		System.out.println("Reversed form: ");
		for(int i=together.length()-1; i>=0; i-- ) {
			reversed = reversed + together.charAt(i);
		}
		
		System.out.println(reversed);
	}

}

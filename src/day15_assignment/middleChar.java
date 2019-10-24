package day15_assignment;

import java.util.Scanner;

public class middleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Write a Java method to display the middle character of a string. Go to the editor
			a) If the length of the string is even there will be two middle characters.
			b) If the length of the string is odd there will be one middle character.
			
			
			Input:
			Input a string: elephant 
			Output:
			
			The middle character in the string: ph
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Give me word, I will give you middle:");
		
		String m;
		String str = s.next();
		int l = str.length();
		
		
		if(l%2==0) m = str.charAt(l/2-1)+""+str.charAt(l/2);
		else m = str.charAt(l/2)+"";
		
		s.close();
		
		System.out.println("Middle char or 2letters: "+ m);
	}

}

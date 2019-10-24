package day15_assignment;

import java.util.Scanner;

public class checkWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
				 Program accepts 3 words and :
		- if they are same length:      print "All words are same length"
		- if some same length and others not:    print "Not Same nor Different lengths"
		- if all different length :  print "All different length"
		 */
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Give me 3 words, I will compare the lengths");
		a = s.next().length();
		b = s.next().length();
		c = s.next().length();
		
		if(a==b && b==c) System.out.println("All words are same length");
		else if((a==b)||(a==c)||(b==c)) System.out.println("Not Same nor Different lengths");
		else System.out.println("All different length");
		
		s.close();
	}

}

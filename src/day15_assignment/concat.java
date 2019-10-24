package day15_assignment;

import java.util.Scanner;

public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String a, b, together;

		System.out.println("Give me 2 words, I will concat them");
		a = s.next();
		b = s.next();
		
		
		
		if(a.charAt(a.length()-1)==b.charAt(0))  together = a.concat(b.substring(1));
		else together = a.concat(b);
		System.out.println(together);

		s.close();
	}

}

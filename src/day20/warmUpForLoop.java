package day20;

import java.util.Scanner;

public class warmUpForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int max = -2_147_483_648;
		int min = 2_147_483_647;

		
		int maxInt = Integer.MAX_VALUE;
		
		for(int i=1; i<=4; i++) {
			System.out.println("Enter a number: ");
			
			int temp = s.nextInt();
			
			
			if(temp>=max) max = temp;
			if(temp<=min) min = temp;
			
		}
		
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
		System.out.println(maxInt);
	}

}

package day30_return_method;

import java.util.Arrays;

public class Zombi {

	public static void main(String[] args) {
		
		/*
An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) to a city with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
		 */
		
		int[] arr = {3, 6, 0, 4, 3, 2, 7, 0};
		
		int day=0;

		System.out.println("Day "+ day+" "+Arrays.toString(arr) );
		
		int[] temp = new int[8];
		
		while(!isEmpty(arr)) {
			day++;
			
			for(int i=0; i<8; i++) {
				temp[i]=arr[i];
			}
			
			if(arr[1]==0) temp[0]= temp[0]/2;
			if(arr[6]==0) temp[7]= temp[7]/2;	
			
			
			for(int i=1; i<arr.length-1; i++) {

			if(arr[i+1]==0 || arr[i-1]==0) {
					temp[i]=temp[i]/2;
				}
			
				
				
				
			}
			
			for (int i = 0; i < temp.length; i++) {
				arr[i]=temp[i];
			}
			
			System.out.println("Day "+ day+" "+ Arrays.toString(arr) );
			
		}
		
		System.out.println("---- EXTINCT ----");
		
		
		
	}
	
	public static boolean isEmpty(int[] a) {
		for(int each : a) {
			if(each != 0) return false;
		}
		return true;
	}

}

package day53_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class ArraysSort {

	public static void main(String[] args) {
		
		
		int[] a = {10,5,20,50};

		System.out.println(Arrays.toString(sortAccending(a)));
		

		
	}
	
	
	public static int returnMin(ArrayList<Integer> list) {
		
		int min = Integer.MAX_VALUE;
		for(int each: list) {
			if(each<min) min= each;
		}
		return min;
	}
	
	public static int[] sortAccending(int[] arr) {

		ArrayList<Integer> list = new ArrayList();
		//we added all elements of array to the list
		for(int each: arr) {
			list.add(each);
		}
		
		//we execute the code arr.length times
		for(int i=0; i<arr.length; i++) {
			//finding the min of list
			int min = returnMin(list);
			arr[i] = min;
			//then we remove the element from the list, without valueOf method it will try to remove element on that index
			list.remove(Integer.valueOf(min));
		}
		
		return arr;
		
	}
	
}

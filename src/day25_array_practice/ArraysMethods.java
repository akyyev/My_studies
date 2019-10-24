package day25_array_practice;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,4,3,2,7,8,9,6, 10}; //unsorted array.
		Arrays.sort(arr); // sorts the array, now arr is sorted.
		System.out.println(Arrays.toString(arr));
		
		

		int decendingOrder[] = new int[arr.length];
		
		for(int i=arr.length-1; i>0; i--) {
			
			decendingOrder[arr.length-i-1] = arr[i];
		}
		/*
		
		int z=0;
		
		for(int i=arr.length-1; i>0; i--) 
		{
			decendingOrder[z] = arr[i];
			z++;
		}
		
		 */
		System.out.println(Arrays.toString(decendingOrder));
		
		
		String[] strArr = {"Bagtyyar", "Yunus", "Selbinyaz", "Gulsatjan", "Isgender", "Mekan", "Eziz", "Ayse", "Nabat", "Serdar"}; //unsorted
		Arrays.sort(strArr); //now it's sorted
		System.out.println("Sorted but in decending order:"+Arrays.toString(strArr));
		
		String[] decreasingOrder = new String[strArr.length];
		
		int count=0;
		for(int i=strArr.length-1; i>=0; i--) {
			decreasingOrder[count] = strArr[i];
			count++;
		}
		
		System.out.println("Now it's in ascending order:"+Arrays.toString(decreasingOrder));
		
		
		
		
		
		
		
		
	}

}

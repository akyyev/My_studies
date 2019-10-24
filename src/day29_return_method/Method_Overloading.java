package day29_return_method;

import java.util.Arrays;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(sum(2,3,1));
		System.out.println(sum(3, 2.4));
		
		
		int[] a = {100,2,5,7,12,234,90};
		String[] b = {"Bag", "Yunus", "Gulshat", "Enem", "Atam"};
		
		System.out.println(Arrays.toString(ascSort(a)));
		System.out.println(Arrays.toString(ascSort(b)));
		
		
		main(a); // will call main method int array
		//main(b);
		
		
	}
	public static void main(int[] args) {
		System.out.println("int array");
	}
	
	public static String[] ascSort(String[] arr) {
		
		Arrays.sort(arr);
		
		String[] res = new String[arr.length];
		int count = 0;
		for(int i=arr.length-1; i>=0; i--) {
			res[count] = arr[i];
			count++;
		}
		
		return res;
	}
	
	public static int[] ascSort(int[] arr) {
		
		Arrays.sort(arr);
		
		int[] res = new int[arr.length];
		int count = 0;
		for(int i=arr.length-1; i>=0; i--) {
			res[count] = arr[i];
			count++;
		}
		
		return res;
	}
	
	public static int sum(int a, int b) {
		
		return a+b;
	}
	
	public static double sum(double a, double b) {
		
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		
		return a+b+c;
	}

}

package day36_arraylistPractice2;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayList_Practice {
	
	public static void main(String[] args) {
		
		
		
		   /*
	    Warm Up: 
	        1. write a return method that accepts an int array and returns it as an ArrayList
	        2. write a return method that accepts an Integer arrayList and returns the maximum number
	                DO NOT USE SORT METHOD
	        3. write a return method that accepts an Integer arrayList and returns the second maximum number
	                DO NOT USE SORT METHOD
	        4. write a return method that accepts an Integer array and returns the minimum number
	                DO NOT USE SORT METHOD
	        5. write a return method that accepts an Integer arrayList and returns the second minimum number
	                DO NOT USE SORT METHOD
	    */
		
		
		/*
		 WarmUp:
		    6. write a return method that can remove the duplicated objects from an Integer arraylist
		    7. write a return method that can remove the duplicated objects from a String arraylist
		    8. write a return method that can remove the duplicated objects from a Character arraylist
		    9. write a return method that can remove the duplicated objects from a Double arraylist
		 */
	    
		int[] arr = {10,200,30,100, 250, 300, 150, 15, 12, 15, 1,1,1,12,2,2};
		
		System.out.println(arrayToArrayList(arr));
		System.out.println(max(arrayToArrayList(arr)));
		System.out.println(secondMin(arrayToArrayList(arr)));
		
		
		//ArrayList
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,6,7,8,9,10,10));
		System.out.println(removeDup(list));
		
		
		String[] arr2 = {"Remington", "Laurent", "Emon", "Damion", "Emon", "Remington"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		list2.add("Laurent");
		list2.add("Sh'tara");
		list2.add("Aaliyah");
		list2.add("Emon");
		
		System.out.println(list2);
		System.out.println(list2.size());
		
		
		System.out.println(removeDup2(list2));
		System.out.println(removeDup2(list2).size());
		
		
		
	}
	
	
	//task:1
	public static ArrayList<Integer> arrayToArrayList(int[] arr){
		
		
		ArrayList<Integer>  res = new ArrayList<>();
		
		
		for(int i=0; i<arr.length; i++) {
			
			res.add(arr[i]);
			
		}
		
		
		
		return res;
		
	}
	
	//task:2
	public static int max(ArrayList<Integer> list) {
		
		int max=Integer.MIN_VALUE;
			
		for(int each : list) {
				
				if(each>max) max = each;
				
			}
			
			
			
		return max;
	}

	//task:3
	public static int secondMax(ArrayList<Integer> list) {

		/*
		 * first we find max of list
		 * then we remove it from the list, to remove all used removeAll method
		 * it accepts interface, that's why used Arrays.asList
		 * then removing max second max will be expected result
		 */
		
		Integer max = max(list);  //auto boxing
		
		list.removeAll(Arrays.asList(max));
		
		Integer scnd = max(list);

		return scnd;

	}
	
	//task:4
	public static int min(ArrayList<Integer> list) {
		
		int min = Integer.MAX_VALUE;
		
		for(int each : list) {
			
			if(each<min) min = each;
		}
		
		return min;
		
		
	}
	
	//task:5
	public static int secondMin(ArrayList<Integer> list) {
		
		Integer minimum = min(list);
		
		list.removeAll(Arrays.asList(minimum));
		
		int res = min(list);
		
		return res;
	}

	//task:6
	public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
		
		ArrayList<Integer>  res = new ArrayList<>();
		
		for(Integer each : list) {
			
			if(! res.contains(each)) res.add(each);
			
		}
		
		return res;
		
	}
	
	
	//task:7
	public static ArrayList<String> removeDup2(ArrayList<String> list){
		
		ArrayList<String> res = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			
			if(!res.contains(list.get(i))) {
				res.add(list.get(i));
			}
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
}

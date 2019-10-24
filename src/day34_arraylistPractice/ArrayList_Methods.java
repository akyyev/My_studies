package day34_arraylistPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {

	public static void main(String[] args) {
		
		/*
		 
		 Methods over ArrayLists
		 	
		 	size():						returns the size of the ArrayList.
		 	add(value) : 				adds the value end of the occurring  values to ArrayList;
		 	set(index, value) :			set the value on the index and moves the values to the right;
		 	remove(Object value):		removes the value and returns boolean expression;
		 	remove(index):				removes the value on that index and returns that value;
		 	get(index): 				returns the value on the index from ArrayList;
		 	indexOf(object): 			returns the index of given object
		 	addAll(ArrayList b1):		takes ArrayList and combines with itself.
		 	removeAll(ArrayList b2):	removes elements form given array.
		 	
		 
		 	
		 Converting array to ArrayList: 
		 	1. Create an ArrayList
		 	2. For parameter give -> Arrays.asList(arrName);
		 	
		 	Ex: 
		 			ArrayList<Type> charList = new ArrayList<Type>(     Arrays.asList(arrName)     );
		 			
		 			So, the list will have all of the elements of arrName array.
	
	
		 */
		
		ArrayList<Integer> ints = new ArrayList<>();
		
		ints.add(3);
		ints.add(45);
		ints.add(-1);
		ints.add(12);
		ints.add(3,13);
		ints.add(0, 100);
		ints.set(0, 1);
		ints.remove(0);   // removes the value on index = 0;
		
		Integer a = 12;
		
		
		int is12Removed = ints.remove(3);
		System.out.println(is12Removed);
		
		System.out.println("Unsorted: "+ints);
		
		System.out.println("Maximum of List: "+maxOfList(ints));
		System.out.println("Minimum of List: "+minOfList(ints));
		
		sortingList(ints);
		System.out.println("Sorted: "+ints);
		
		System.out.println(ints.indexOf(45));
	
		int[] arr = {20,21,22,23,24,25};
		
		
		ArrayList<Integer> arrlist2 =  new ArrayList<Integer>(1); 

		// use add() method to add elements in list2 
			arrlist2.add(20); 
			arrlist2.add(21); 
			arrlist2.add(22); 
			arrlist2.add(23); 
			arrlist2.add(24);
			arrlist2.add(25);
			arrlist2.add(26);
		
		ints.addAll(arrlist2);
		System.out.println("After adding to list: "+ ints);
		
		ints.removeAll(arrlist2);
		System.out.println("After removing from list: "+ ints);
		

		String[] strArr = {"Gulshat","Yunus","Bagtyyar"};
		ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArr));
		
		strList.add("Asym");
		strList.add("Eziz");
		strList.add("Aynur");
		
		
		System.out.println(strList);
		
		
		
	}
	
	public static ArrayList<Integer> sortingList(ArrayList<Integer> list){
		
		Collections.sort(list);
		
		return list;
	}

	public static int maxOfList(ArrayList<Integer> list){
		
		int max = Integer.MIN_VALUE;
		
		for(int each : list) {
			if(each>=max) max = each;
		}
		
		return max;
		
	}
	
	public static int minOfList(ArrayList<Integer> list){
		
		int min = Integer.MAX_VALUE;
		
		for(int each : list) {
			if(each<=min) min = each;
		}
		
		return min;
		
	}
	
	
}

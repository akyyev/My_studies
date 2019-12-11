package day27_methods;

import java.util.Arrays;

import day22_practice_questions.Divide_Mystery;

public class Methods {

	public static void main(String[] args) {
		
		System.out.println(removeDuplicates("aabbssssaaaccccdde"));
		
		divideTwoNums(3,0);
		
		checkStrings("nesil", "lines");
		
		
		
		int[] arr1 = {5,4,12,567,21,-1,90};
		
		System.out.println(maxOfArray(arr1));
		
		
		
		System.out.println((double) 5/0+"\"bagtyyar\"");
	}
	
	public String altPairs(String str) {
		  String result = "";
		  
		  for (int i=0; i<str.length(); i += 4) {
		    int end = i + 2;
		    if (end > str.length()) {
		      end = str.length();
		    }
		    result = result + str.substring(i, end);
		  }
		  
		  return result;
		}
	
	
	//removes duplicates of string
	private static String removeDuplicates(String str) {
		String result="";
		for(int i=0; i<str.length(); i++) {
			if(! result.contains(str.charAt(i)+"")) {
				result +=str.charAt(i);
			}
		}
		return result;
	}
	
	/*
			1. Create a method that can divide two numbers without using division operators.
			        
			2. Write a method that check if a string is build out of the same letters 
			     as another string.
			     
			3. Write a method that returns max value out of array of integers.
			 	DO NOT use sort method
			    Ex: int[] arr = {2,3,4};      max(arr) -> 4
			            
			            
			4. write a method that can find the unique characters from the String
			    Ex:         unique("AAABBBCCCDEF") ==> "DEF";
			5. write a method that can reverse the a String
			    Ex: Reverse("ABC") ==> CBA
	 */
	
	public static void divideTwoNums(int a, int b) {
		if(b==0) System.out.println("you cannot divide with zero :( ");
		else System.out.println((double)a/b);
	}
	
	
	// to check if strings are made of same chars.
	public static void checkStrings(String a, String b) {
		char[] first = removeDuplicates(a).toCharArray();
		char[] second = removeDuplicates(b).toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		System.out.println(Arrays.toString(first).equals(Arrays.toString(second)));
		
		
	}
	
	public static int maxOfArray(int[] a) {
		int max = Integer.MIN_VALUE;
		
		for(int each : a) {
			if(each>=max) max = each;
		}
		
		return max;
		
	}
	
	
}

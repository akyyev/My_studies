package day62_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsPractice {

	public static void main(String[] args) {
		/**
		 *  	Write a program that can remove duplicates from String
		 *  	
		 *  	String str = "AAAAABBBBCCCCCCCD";
		 */
		
		String str = "DAAAAABBBBCCCCCCCD"; //  ---> DABC
		String[] arr = str.split("");
		
		Set<String> list = new LinkedHashSet<>(Arrays.asList(arr));
		//will not be sorted, 
		//if you want sorted then use TreeSet instead LinkedHashSet
			System.out.println(list); // [D, A, B, C]
		
		//to print DABC you can do string manipulation or use for loop
			String res = "";
			for(String each: list) {
				res +=each;
			}
			System.out.println(res);
	}
}

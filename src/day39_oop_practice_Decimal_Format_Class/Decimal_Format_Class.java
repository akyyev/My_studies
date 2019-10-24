package day39_oop_practice_Decimal_Format_Class;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Decimal_Format_Class {

	public static void main(String[] args) {
		
		DecimalFormat decNum = new DecimalFormat("0");
		
		double d1 = 4.553232213123;
		
		String d = decNum.format(d1);
		
		int a1 = Integer.parseInt(decNum.format(d1));
		
		System.out.println(d);
		System.out.println(a1);
		
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("d", "e", "f"));
		
		System.out.println(combineAll(l1, l2));
		
		System.out.printf("%.2f %n",d1);  //printf is with function, % is for formula and %n for blank space
		
		
		
	}
	
	

	
	public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  
		  ArrayList<String> list = new ArrayList<>();
		  
		  for(String each : wordList1){
		    list.add(each);
		  }
		  for(String each : wordList2){
		    list.add(each);
		  }
		  
		  return list;
		  
		}
	

}

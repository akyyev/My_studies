package day36_arraylistPractice2;

import java.util.ArrayList;
import java.util.Arrays;

public class OptionalTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numToWord(106));

		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(100, 100, 20, 300, 300, 40, 500, 500));
		
		System.out.println(unique(list));
		
		ArrayList<String> list2 =new ArrayList<>(Arrays.asList("Toyota", "lada", "BMW", "bMw", "TOYOTA", "ToYoTa", "Tesla", "TESLA", "tEsLa"));
		
		System.out.println(frequencyOfObj(list2, "lada"));
		
		System.out.println(changeXY("codex"));
	}
	
	//recursive function, changes x char with y char
	public static String changeXY(String str) {
		  String res = "";
		  
		  
		  if(str.equals("x")) res +="y";
		  else if(str.length()==1) res +=str;
		  else if(str.length()<1) res +="";
		  else res += changeXY(str.charAt(0)+"")+changeXY(str.substring(1));
		  
		  return res;
		}

	// converts number to word from 0-999
	public static String numToWord(int num) {

		String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] numsTo20 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };



		String res = "";

		if (num < 20) {
			res = numsTo20[num];
		}
		else if(num < 100) {
			
			res = tens[num / 10];
			if(num % 10 != 0) res += " " + numsTo20[num%10];
			
		} else {
			//3rd digit of a number
			res = numsTo20[num/100]+" hundred";
			
			char secondChar = (num+"").charAt(1);
			char thirdChar = (num+"").charAt(2);
			if(secondChar=='0' && thirdChar!='0') res +=" and";
			
			if(num%100<20 && num%100>0) res += " " + numsTo20[num%100];
			
			else{
				res += " " + tens[num%100/10];
				if(num%10!= 0) res += " " + numsTo20[num%10];
			}

		}

		res = (res.charAt(0) + "").toUpperCase() + res.substring(1);

		return res;
	}

	
	//takes integer arrayList and returns unique values as list
	public static ArrayList<Integer> unique(ArrayList<Integer> list){
		
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int each : list) {
			int count=0;
			for(int each2 : list) {
				if(each==each2) {
					count++;
				}
			}
			if(count==1) res.add(each);
		}
		return res;
	}
	
	
	//takes string list and finds appearance of target string
	public static int frequencyOfObj(ArrayList<String> list, String target) {
		int count = 0;
		for(String each : list) {
			if(each.equalsIgnoreCase(target)) {
				count++;
			}	
		}
		return count;
	}
	
	
}

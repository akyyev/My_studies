package day53_Interfaces;

public class FrequencyOFChars {

	public static void main(String[] args) {
		
		String str = "AAABBBCC";
		//				ABC
		System.out.println(frequency(str));
		
		
	}
	
	public static String remDup(String str) {

		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(!res.contains(str.charAt(i)+"")) res += str.charAt(i);
		}
		return res;
	}
	
	public static String frequency(String str) {
		//after removing duplicates ABC
		String nonDup = remDup(str);
		//str = "AAABBBCC";
		
		String res="";
		
		for(int i=0; i<nonDup.length(); i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if(nonDup.charAt(i)==str.charAt(j)) count++;
			}			
			res += ""+nonDup.charAt(i)+ count;
		}
		
		
		return res;
	}
	
	
}

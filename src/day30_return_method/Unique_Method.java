package day30_return_method;

public class Unique_Method {

	public static void main(String[] args) {
		
		System.out.println(unique("SBBCCDDDEFFFT"));
		
	}
	
	
	
	
	public static String unique(String str) {
		
				// "AABBBCCDDDEFFFT"  ==> "ET"
		
		String res = "";
		
		for(int j=0; j<str.length(); j++) {
			
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			
			if(count==1) res +=str.charAt(j);
			
		}
		
		return res;
	}
}




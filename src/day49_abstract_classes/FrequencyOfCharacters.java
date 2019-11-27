package day49_abstract_classes;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbbaabbbbcccdde";
		System.out.println(frequency2(s));
		
		
		
	}

	public static String frequency(String str) {
		String noDupl = removeDuplicates(str);
		String res = "";
		for(int i=0; i<noDupl.length(); i++) {
			res += ""+noDupl.charAt(i)+appearence(str, noDupl.charAt(i));
		}
		
		return res;
	}
	
	public static String removeDuplicates(String str) {
		String res = "";
		
		for(int i=0; i<str.length(); i++) {
			if(!res.contains(str.charAt(i)+"")) res += str.charAt(i);
		}
		return res;
	}
	
	public static int appearence(String str, char c) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) count++;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	public static String frequency2(String str) {
		
		String noDup = "";
		for(int i=0; i<str.length(); i++) {
			if(!noDup.contains(str.charAt(i)+"")) noDup += str.charAt(i);
		}
		
		String res = "";
		for(int i=0; i<noDup.length(); i++) {
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if(noDup.charAt(i)==str.charAt(j)) count++;
			}
			res += noDup.charAt(i)+""+count;
		}
		
		
		return res;
		
	}
}

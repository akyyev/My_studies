package day30_return_method;

public class FrequencyOfCharsOnWord {
	
	public static void main(String[] args) {
		//this program will calculate a frequency of each char on given string
		
		System.out.println(removeDup("bagtyyar   akyyev"));
		System.out.println(appearence("bagtyyar", "y"));
		System.out.println(frequency("zamana"));

	}
	
	

	public static String removeDup(String str) {
		String res="";
		
		for(int i=0; i<str.length(); i++) {
			if(!res.contains(str.charAt(i)+"")) {
				res += str.charAt(i);
			}
		}
		return res;
	}
	

	public static int appearence(String str, String x) {
		int count=0;
		
		for(int i=0; i<str.length(); i++ ) {
			if((str.charAt(i)+"").equals(x)) {
				count++;
			}
		}
		
		return count;
	}
	

	public static String frequency(String str) {
		String res="";
		String temp= removeDup(str);
		
		for(int i=0; i<temp.length(); i++) 		res += temp.charAt(i)+""+appearence(str, temp.charAt(i)+"");
	
		return res;
		
		
	}

}


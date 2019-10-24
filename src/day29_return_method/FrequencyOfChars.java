package day29_return_method;

public class FrequencyOfChars {

	public static void main(String[] args) {

		System.out.println(frequency2("AABBBCCCDDDDDDDDE"));
		
		
		String[] strArray = {"bag", "kitap", "bagtyyar", "gayypnazar", "agamjanlarym"};
		
		System.out.println(longest(strArray));
		
		method1();
	}
	
	public static String frequency2(String str) {
   
        
        String expectedResult = "";
        
      
    while(  str.length()>0) {
        int count = 0;
        for(int i=0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(0)) {
                count++;
            }
        }
        expectedResult +=str.charAt(0)+"" + count;
         str = str.replace(""+str.charAt(0) ,  "" );  
                // after adding the str.charAt(j),
    }
      return  expectedResult;


}
	

	public static void method1() {
		
		//System.exit(0);  //exits all java execution
		System.out.println("Hello, Java World!");
		
		return ;
	}
	
	
	public static String longest(String[] arr) {
		
		
		int max=Integer.MIN_VALUE;
		String longest="";
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>=max) {
				longest=arr[i];
				max= arr[i].length();
			}
		}
		
		
		return longest;
	}
	
	
	
	public static String frequency(String str) {

		String removeDuplicate = "";
		for (int i = 0; i < str.length(); i++) {
			if (!removeDuplicate.contains(str.charAt(i) + "")) {
				removeDuplicate += str.charAt(i);
			}
		}

		String result = "";
		for (int j = 0; j < removeDuplicate.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == removeDuplicate.charAt(j)) {
					count++;
				}
			}

			result += removeDuplicate.charAt(j) + "" + count;
		}
		return result;	
		
		
	}
	
	
	
}

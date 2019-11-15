package day49_abstract_classes;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing Length".length());
		System.out.println(lengthOfString("Testing Length"));
	}

	public static int lengthOfString(String str) {
		if(str.isEmpty()) return 0;
		int i=0;
		while(!str.substring(i).isEmpty()){
			i++;
		}
		return i;
	}
}

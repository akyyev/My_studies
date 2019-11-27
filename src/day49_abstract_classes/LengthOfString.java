package day49_abstract_classes;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method();
		System.out.println("".substring(0).isEmpty());
		System.out.println(lengthOfString(""));
	}

	public static int lengthOfString(String str) {
		int i=0;
		while(!str.substring(i).isEmpty()){
			i++;
		}
		return i;
	}
	
	public static void method() {
		  int a=10, b=20;
		  /*
		              1684210
		      a =      010100
		      b =      101000
		      a = a^b =111100    exclusive bitwise or
		      b = a^b =010100  --> 10
		      a = a^b =101000  --> 20
		   */
		          a=a^b;
		          b=a^b;
		          a=a^b;
		          
		          System.out.println("a="+a+ " and b="+b);
	}
}

package day09;

public class Task03_Biggest {
	public static void main(String[] args) {
		
		int n1=1,n2=2,n3=1;
		
		//assuming there is ONLY ONE greatest number
		
		if(n1>n2 && n1>n3) {
			System.out.println("Greatest one is: "+n1);
		}
		
		if(n2>n1 && n2>n3) {
			System.out.println("Greatest one is: "+n2);
		}
		
		if(n3>n1 && n3>n2) {
			System.out.println("Greatest one is: "+n3);
		}
		
		
	}
}

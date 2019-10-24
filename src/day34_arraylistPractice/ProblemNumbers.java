package day34_arraylistPractice;

public class ProblemNumbers {

	public static void main(String[] args) {
		
	//	aaa+bb+a = cab
	
		// 102a+10b = 100c
		
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if( (102*a+10*b)%100==0    ) {
					System.out.println(a);
					System.out.println(b);
					System.out.println((102*a+10*b)/100);

				}
			}
		}
		
		
		
		
		
		
	}
}

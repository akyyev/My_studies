package day23_arrays_practice;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timer(1);
		
	}

	public static void timer(int mins) {
		
		for(int i=mins; i>=0; i--) {
			
			if(i<0) break;
			
			for(int j=59; j>=0; j--) {
				
				System.out.println(i-1+" minutes and "+j+ " seconds left");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				
			}
			
		}
		
		
	}
}

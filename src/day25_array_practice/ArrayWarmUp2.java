package day25_array_practice;

public class ArrayWarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program that can print only unique values
		
		String arr[] = {"A", "B", "C", "C", "D", "E", "E"};
		
		
		for(int j=0; j<arr.length; j++) {
			int count = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(arr[j])) {    //it's better to use .equals instead of ==, because since we want to compare values not memory location.
					count++;
				}
				
			}
			
			if(count==1) {
				
				System.out.print(arr[j]+" ");
			}
		}
		
		
	}

}

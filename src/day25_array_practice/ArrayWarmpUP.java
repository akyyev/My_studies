package day25_array_practice;

public class ArrayWarmpUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find unique number from array
		
		int [] arr = {1,2,3,4,5,1,2,3,4,6,7,9,10,11};
		
		System.out.println("Unique elements: ");
		for(int j=0; j<arr.length; j++) {
			
			//arr[i]==1 bashladym song ikinji loop y goshmaly
			
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==arr[j]) {     // bashlangycda ilkinji element gaytalanyar shony barlamaly, songra loop bilen beylekileri 1 ==> arr[j]
					count++;
				}
			}
			
			if(count==1) {
				System.out.print(arr[j]+" ");
			}
			
		}
		

		//
		
		
		
		
	}

}

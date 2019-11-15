package day43_RevievStaticInstance_Date_YEAR_DAY;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {
	
	
	/*
	 
	 	static { 
			driver.manage().window().maximize();
		}
	
	 */
	
	static String[] arr = new String[3];
	static ArrayList<String> list = new ArrayList<>();
	
	double salary;
	
	static {
	        
	        System.out.println("static block");
	        arr[2] = "Alla";
	        arr[0] = "Kateryna";
	        arr[1] = "Ruslan";
	        
	         list.addAll( Arrays.asList(arr) );
	         
	        // salary = 5000;  // static only accepts static
	         
	         StaticBlock obj1  = new StaticBlock(); 
	            obj1.salary = 4000;
	            System.out.println( obj1.salary ); // 4000
	    }

	public static void main(String[] args) {
		
		System.out.println(list);
	}
	
	

}

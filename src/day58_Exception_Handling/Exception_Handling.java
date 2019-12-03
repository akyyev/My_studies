package day58_Exception_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Exception_Handling {
	
	/** There are two main types of exception: Checked and Unchecked exceptions
	 * 											Checked exception need to be handled immediately
	 * 											Unchecked exception occurs on runtime
	 * 1. Throwable
	 * 		a) Error	
	 * 		b) Exceptions 	
	 * 			i) 	IOException
	 * 			ii) ClassNotFoundException
	 * 			iii)CloneNotSupportedException
	 * 			iv) RuntimeException
	 * 					Arithmetic, ClassCast, Illegal Argument, Illegal State, 
	 * 					IndexOutOfBounds, NoSuchElement, NullPointer exceptions
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println("Hi my name is A");
		wait(0.5);
		System.out.println("What is your name?");
		
		//full path is necessary
		String name = getData("name", "/Users/mac/eclipse-workspace/My_studies/src/day58_Exception_Handling/test.properties");
		System.out.println(name);
		
		//file path is not necessary if it's located under project folder
		String name2 = getData("name", "test2.properties");
		System.out.println(name2);
		
		/**
		 * What is code output?
		 * 		A) HI				-----> correct answer
		 * 		B) Hello
		 * 		C) Batch 12
		 * 		D) Compile error
		 * 		E) Runtime error
		 */
		
		
		if(5>0 || 5/0==0) {
			System.out.println("HI");
		} else if(5>6 && 5/0==0) {
			System.out.println("Hello");
		} else {
			System.out.println("Batch 12");
		}
		
	}
	
	public static String getData(String key, String filePath) {
		Properties config = new Properties();
		try {
			FileInputStream input = new FileInputStream(filePath);
			config.load(input);
			input.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File is not found, check the path given");
		}
		
		return config.getProperty(key);
	}
	
	

	public static void wait(double sec) {
		
		
		try {
			Thread.sleep((int)(sec*1000));
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}

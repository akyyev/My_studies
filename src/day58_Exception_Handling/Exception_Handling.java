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
	 * 					FileNotFoundException
	 * 			ii) ClassNotFoundException
	 * 			iii)CloneNotSupportedException
	 * 			iv) RuntimeException
	 * 					Arithmetic, ClassCast, Illegal Argument, Illegal State, 
	 * 					IndexOutOfBounds, NoSuchElement, NullPointer exceptions
	 * 
	 * try block: gets executed if the exception is checked
	 * catch block: gets executed if the exception is unchecked
	 * finally block: can use finally block along with try&catch blocks.
	 * 					codes in finally ALWAYS gets executed regardless of the exception
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		//unchecked exception
		try{
			System.out.println(9/0);
			System.out.println("try block");
		}catch(RuntimeException e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("----------------");
		
		//checked exception
		try{
			Thread.sleep(200);
			System.out.println("Try block");
		} catch(Exception e) {
			System.out.println("Catch block");
		} finally {
			System.out.println("Finally block");
		}
		
		System.out.println("----------------");
		
		//unchecked exception
		/*
			 	try{
					System.out.println(1/0);
					System.out.println("try block");
				}
				catch(NullPointerException e) {  
					//NullPointerException will not handle 1/0 Arithmetic exception
					//So, it will give arithmetic exception and will execute finally block too.
					System.out.println("catch block");
				} 
				finally {
					System.out.println("finally block");
				}
		 */
		
		System.out.println("Hi my name is A");
		wait(0.5);
		System.out.println("What is your name?");
		
		//full path is necessary
		//After project name is fine if it's created in the project
		// So, this will also work: src/day58_Exception_Handling/test.properties
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
			//if here is some unchecked exception it will execute catch block
			//For example if we give wrong file path it will execute catch block
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File is not found, check the path given");
		}
		
		return config.getProperty(key);
	}
	
	

	public static void wait(double sec) {
		try {
			Thread.sleep((long)(sec*1000));
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	//If I have a lot of checked exceptions in my code I can just use 'throws' keyword 
	//Instead of having multiple try/catch blocks
	//But whenever we call this method still we have to deal with those exceptions
	
	//Also methods can throw more than one exception
	
							//throws Exception will ignore all exceptions
	public static void test() throws Exception, IOException{
		
		Thread.sleep(-3000); //checked exception
		
		System.out.println(9/0); //unchecked exception
		
		int[] a= {1,2};
		System.out.println(a[4]); //unchecked exception
		
		FileInputStream fileInputStream = new FileInputStream("//mac");   //checked exception
		
	}
	
	
	
	
	
	
}

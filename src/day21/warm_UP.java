package day21;

import java.util.Scanner;

public class warm_UP {

	public static void main(String[] args) {
		
		// finra();
		//plaindrome();			// checks if word is plaindrome or not
		//removeDuplicate();   //removes duplicates of characters.
		//numOfBook2();
		//printAll();
		
		//to start with new line
		System.out.println();
		//addingNums();
		//finra2();
		
		plaindrome2();
		
		
	}
	
	public static void plaindrome2() {
		//without for loop
	Scanner s = new Scanner(System.in);
		
		String word = s.next();
		String result = "";
		int i = word.length()-1;
		while(i>=0) {
			result = result+word.charAt(i);
			i--;
		}
		
		System.out.println(result.equals(word));
		s.close();
	}
	
	
	public static void finra2() {
		int i=1;
		String p="";
		while(i<=30) {
			if(i%15==0) p+="FINRA ";
			else if(i%3==0) p+="FIN ";
			else if(i%5==0) p+="RA ";
			else p+=i+" ";
			i++;
		}
		System.out.print(p);
	}
	
	
	public static void finra() {
		for(int i=1; i<=30; i++) {
			String p;
			if(i%15==0) p="FINRA";
			else if(i%3==0) p="FIN";
			else if(i%5==0) p="RA";
			else p=i+"";
		
			System.out.println(p);
		}
	}
	
	public static void plaindrome() {
		Scanner s = new Scanner(System.in);
		
		String word = s.next();
		String result = "";
		for(int i=word.length()-1; i>=0; i--) {
			result = result+word.charAt(i);
		}
		System.out.println(result.equals(word));
		s.close();
	}
	
	public static void removeDuplicate() {
		Scanner s = new Scanner(System.in);
		
		String word = s.next();
		s.close();
		
		String result="";
		for(int i=0; i<word.length()-1;i++) {
			if(!result.contains(word.charAt(i)+"")) {
				result += word.substring(i,i+1);
			}
		}
		
	System.out.println(result);
	}
	
	public static void numOfBook() {
		/*
		 1. write a java program that can count how many time 
		 	the word "book" is appeared in a String
		    Ex:
			input: I like books, I have books, I need book
			output: 3
		 */
		
		String a = "Book is very Book. I like to read Book and I like to give Boroky. And I like to sell Book";
		int counter=0;
		for(int i=0; i<a.length()-3; i++) {
			if(a.substring(i,i+4).contains("Book")) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}
	
	// second version with while loop
	public static void numOfBook2() {
		/*
		 1. write a java program that can count how many time 
		 	the word "book" is appeared in a String
		    Ex:
			input: I like books, I have books, I need book
			output: 3
		 */
		
		String a = "Book is very Book. I like to read Book and I like to give Boroky. And I like to sell Book";
		int counter=0;
		
		while(a.contains("Book")) {
			a = a.replaceFirst("Book", "");
			counter++;
		}
		
		System.out.println(counter);
		
	}
	
	/*
	 use while loop to print all even number between 1-100
	 
	 */
	public static void printAll() {
		int i=0;
		while(i%2==0) {
			i+=2;
			System.out.print(i+" ");
			if(i==100) break;
		}
	}
	
	public static void addingNums() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("First number: ");
			int a = s.nextInt();
			System.out.println("Second number: ");
			int b = s.nextInt();
			
			System.out.println("Total: "+ (a+b));
			System.out.println("Do you want to continue? ");
			String k = s.next();
			
			if(k.toLowerCase().charAt(0)=='n') {
				break;
			}
		}
	}
	
}

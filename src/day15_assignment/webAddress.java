package day15_assignment;

import java.util.Scanner;

public class webAddress {

	public static void main(String[] args) {
		
		/*
		 Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com 
		 */
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give me the URL please:");
	
		String str = sc.nextLine();
		boolean startWithWww = str.startsWith("www");
		
		if(startWithWww) System.out.println("Domain: "+str.substring(str.indexOf(".")+1, str.lastIndexOf(".")));
		else System.out.println("Domain: "+str.substring(0, str.indexOf(".")));
		
		System.out.println("Extension: "+str.substring(str.lastIndexOf('.')+1));
		
		sc.close();
	}

}

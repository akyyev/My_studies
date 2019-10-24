package day22_practice_questions;

import java.util.Scanner;

public class Divide_Mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// divide();
		//uniqueChar(); // not done
		// frequency();
		// lieDetector();

		//System.out.println(altCase("hello how are you?"));
		
		//funWithNumbers(314159);
		
		int i=0;
		int j=7;
		for(i=0; i<j-1; i +=2) {
			System.out.print(i+" ");
		}
		
		
		
		
		
	}
	public static void funWithNumbers(double myDouble)
	{
	    int myInt = (int) myDouble;
	    String myString = "";
	    while(myInt != 0)
	    {
	        myString = myInt % 10 + myString;
	        myInt /= 10;
	    }
	    System.out.println(myString);
	}
	
	
	public String replaceLetter(String word, char letterToReplace, char replacingLetter)
	{
	    return word.replaceAll(letterToReplace+"", replacingLetter+"");
	}
	
	public static boolean passwordCheck(String p)
	{
	    boolean passOK= true;
	    if(p.length()<8) passOK= false;
	    for(int i=0; i<p.length(); i++){
	        char ch = p.charAt(i);
	        passOK = passOK && (  (ch>=65 && ch<=90) ||  (ch>=97 && ch<=122) || (ch>=48 && ch<=57)  );
	    }
	    return passOK;
	}
	
	public static boolean bracketsMatch(String str) {
		
		int c1=0, c2=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='}') return false;
			else if((str.charAt(i)+"").equals("{")) c1++;
			else c2++;
		}
		
		
		return c1==c2;
	}
	
	
	public static String altCase(String text)
	{
	    String r = "";
	    for(int i=0; i<text.length(); i++){
	    	if(i%2==0) r +=(text.charAt(i)+"").toUpperCase();
	    	else r +=(text.charAt(i)+"").toLowerCase();
	    } 
	    return r;
	}

	
	public static String doubleVowel(String str) {
		String r = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' | ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E'
					|| ch == 'O' | ch == 'I' || ch == 'U') {
				r += str.charAt(i) + "" + str.charAt(i);
			} else {
				r += str.charAt(i);
			}

		}
		return r;
	}

	public static void lieDetector() {
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Do you like school?");
			String ans = s.nextLine();

			if (ans.equals("yes") || ans.equals("true")) {
				System.out.println("Thanks for being Honest");
				break;
			} else {
				System.out.println("Tell me truth");
			}
		}

		s.close();
	}

	public static void frequency() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");

		int count = 0, flag = 0;

		String str = sc.nextLine();
		int len = str.length();
		sc.close();

		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = 0; j < len; j++)
				if (str.charAt(j) == str.charAt(i))
					count++;

			for (int k = 0; k < i; k++)
				if (str.charAt(k) == str.charAt(i))
					flag = 1;

			if (flag != 1)
				System.out.print(str.charAt(i) + "" + count + " ");

			flag = 0;
		}

	}

	public static void uniqueChar() {
		Scanner s = new Scanner(System.in);

		System.out.print("Type some word, I will find \"UNIQUE\" chars: ");
		String word = s.next();
		s.close();

		String Unique = ""; // to store unique letters

		for (int j = 0; j < word.length(); j++) {

			int count = 0;

			for (int i = 0; i < word.length(); i++)
				if (word.substring(i, i + 1).equals("" + word.charAt(j)))
					count++;

			if (count == 1)
				Unique += "" + word.charAt(j);

		}
		System.out.println(Unique);

	}

	public static void removeDuplicates() {
		Scanner s = new Scanner(System.in);

		System.out.println("Gimme some word,\nwill give you without duplicates");
		String word = s.next();
		s.close();

		String r = "";
		for (int i = 0; i < word.length(); i++) {
			if (!(r.contains(word.charAt(i) + ""))) {
				r += word.charAt(i);
			}
		}
		System.out.println(r);
	}

	public static void divide() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter divident and divisor: ");
		int divident = s.nextInt();
		int divisor = s.nextInt();
		s.close();

		int sub = Math.abs(divident) - Math.abs(divisor);
		int counter = 0;
		while (sub >= 0) {
			sub -= divisor;
			counter++;
		}
		System.out.println(counter);

	}
}

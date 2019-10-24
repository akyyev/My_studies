package day41_static_initializer_block;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlockPractice {

	public static String name;
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList<>();
	public static String[] online = {"one__", "two__", "three__", "four__"};
	public static String[] inClass = {"five", "six"};
	

	public int grade;

	
	static {
		
		name = "Gulshat";
		
		arr1 = new int[3];
		arr1[1]=5;  // [0,5,0]
		
		list.add("coffee");
		list.add("tea");
		list.addAll(Arrays.asList(inClass));
		
		//to call instance variable we need to create an object from that class.
		StaticBlockPractice obj1 = new StaticBlockPractice();
		obj1.grade = 1;
		System.out.println(obj1.grade);
	}
	

	static {
		
		name = "Yunus";
		
		arr1 = new int[5];
		arr1[0]=2;
		arr1[4]=10;   // [2,0,0,0,10]
		
		list.add("break");
		list.addAll(Arrays.asList(online));
	}
	
	
	//constructor
	public StaticBlockPractice() {
		name = "Bagtyyar";
	}
	
	
	public static void main(String[] args) {
		
		StaticBlockPractice obj1 = new StaticBlockPractice();  //--> bagtyyar
		
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(list);
		
	}
	
	
}

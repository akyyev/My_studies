package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collections_Interface {
	
	/**
	 * Data Structures
	 * 		--Arrays
	 * 		--Collections Framework
	 * 		--Maps
	 	
	 	Array: Collection of Data(same data type)
	 		size is fixed
	 		index numbers
	 		can-be multi-dimensional
	 		supports primitives and objects
	 		can have duplicates
	 	
	 	COLLECTIONS FRAMEWORK
	 		Consists of multiple interfaces, each interface has multiple implementations
	 		
	 		Interfaces:
 			1. Iterable(I) 		(root interface, super type of all the interfaces in collections framework)
 			2. Collections(I) 	(extends Iterable and extended by List, Queue, Set)
 			3. List(I)			(implemented by ArrayList(C), 
 												LinkedList(C) and 
 												Vector(C))
 			4. Set(I)			(Doesn't take any duplicates, Has no index numbers)
 								implemented by HashSet(C),
 												LinkedHashSet(C)
 								extended by SortedSet(I)
 								SortedSet(I) is implemented by TreeSet(C)
 													
 			5. SortedSet
 			6. Queue
 			7. Deque
	 			
	 			
 			ArrayList: Array based class, internally uses dynamic array.
 						(better for storing and accessing data)

 			LinkedList: Each objects are doubly linked in the LinkedList
 						adding and moving data are fast
 						but, retrieving data is slower
 						(better for manipulating)
 						
			Vector: synchronized, only preferred in multi-threads.
						synchronized keyword: used to achieve --> Thread safe in multi-thread environment
						multi-thread: multiple threads try to get access to same resources
						
						Advantage: Thread safe in multi-thread environment
						Drawback: Slower
						
						Has a child class: Stack
						
						Stack: pop() method--> LIFO (Last in, first out)
 						
	 			
	 	
	 */

	public static void main(String[] args) {
		
		//List<Integer> list2 = new List<>(); // compile error
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new  LinkedList<>();
		List<Integer> list3 = new Vector<>();
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
							
						arrayList.add(10);
						arrayList.add(20);
						arrayList.add(30);
				Integer a = 30;
						arrayList.remove(1); //removes value at index 1
						arrayList.remove(a); //removes 30
						
				System.out.println(arrayList);
				
		LinkedList<Integer>  linkedList = new LinkedList<>();
						linkedList.add(10);
						linkedList.add(20);
						linkedList.add(30);
						linkedList.add(40);
						linkedList.remove(1);
		
				System.out.println(linkedList);
				
				
		Vector<String> vector = new Vector<String>();
						
						vector.add("A");
						vector.add("B");
						vector.add("C");
						vector.remove(0); //removes element from index=0;
						vector.remove("B"); //removes "B"
						vector.add("D");
						
				System.out.println(vector);
		
		Stack<Integer> stack = new Stack<Integer>();
				
						stack.add(1);
						stack.add(2);
						stack.add(3);
						stack.add(4);
						int lastElement = stack.pop(); //last in first out
						
				System.out.println(stack);
				System.out.println(lastElement);
				
		
		
		
		
		/*
		 * Set interface: TreeSet(C), HashSet(C), LinkedHashSet(C)
		 * SortedSet(I): sorts the objects in ascending order, implemented by TreeSet(C)
		 */
		
		Set<Integer> sorted = new TreeSet<>(); //sorted set
				
				sorted.add(10);
				sorted.add(5);
				sorted.add(15);
				sorted.add(15); //will be ignored
				
				System.out.println("TreeSet example "+sorted);
				//System.out.println(sorted.get(0)); //no index
				
		/**
		 * 	Task: remove duplicates from an ArrayList, and sort it
		 */
			List<Integer> data = new ArrayList<>();
					data.addAll(Arrays.asList(10,9,8,5,3,2,2,10,1));
					
					System.out.println(data);//not sorted and has duplicates
					//Collections.sort(data); // will sort but still there will be  duplicates
				
					
			TreeSet<Integer> dataNew = new TreeSet<>(data);
					System.out.println(dataNew); //sorted and no duplicates
					/** No need to use for loop to add data to dataNew
					 * 		for(Integer each: data) {
								dataNew.add(each);
							}
					 */
			
		
				
				
		Set<Integer> hashSet = new HashSet<>();
				//order will be randomized
				hashSet.add(100);
				hashSet.add(10);
				hashSet.add(5);
				hashSet.add(4);
				hashSet.add(8);
				
				System.out.println(hashSet);
				
		Set<Integer> linkedHashSet = new LinkedHashSet<>(); 
				//order will be conserved, no index, doubly linked
				linkedHashSet.add(1);
				linkedHashSet.add(10);
				linkedHashSet.add(6);
				linkedHashSet.add(100);
				
				for(Integer each: linkedHashSet) {
					System.out.print(each+" ");
				}
				
	}

}

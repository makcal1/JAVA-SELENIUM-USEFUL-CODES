package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo_01 {

	public static void main(String[] args) {

		// Declare Linked List
		LinkedList l = new LinkedList<>();

		//Add elements into linked list
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);

		System.out.println(l); // [100, welcome, 15.5, A, true, null]
		System.out.println(l.size()); //6

		//remove
		l.remove(3); //index
		System.out.println("After remoeving:" + l); // [100, welcome, 15.5, true, null]
 
		// Insert element
		l.add(3, "Java");
		System.out.println("After inserting element:" + l); // [100, welcome, 15.5, Java, true, null]

		// retriving 
		System.out.println(l.get(3));
		l.set(5, "X");
		System.out.println("After changing the value:" + l); // [100, welcome, 15.5, Java, true, X]

		// contains()
		System.out.println( l.contains("Java"));   //true
		System.out.println( l.contains("Kotlin")); //false

		//isEmpty()
		System.out.println(l.isEmpty());//false	   

		//Reading elements from LL using for loop
		for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l.get(i));
		}

		//Reading elements from LL using for-each loop
		System.out.println("Reading elements using for-each loop.....");
		for (Object object : l) {
			System.out.println(object);
		}

		//Reading elements from LL using iterator
		System.out.println("Reading elements using iterator method.....");
		Iterator iterator = l.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}

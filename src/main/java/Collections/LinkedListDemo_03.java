package Collections;

import java.util.LinkedList;

public class LinkedListDemo_03 {

	public static void main(String[] args) {
		// Declare Linked List
		LinkedList l = new LinkedList<>();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
	
		System.out.println(l); // [dog, dog, cat, horse]
		l.addFirst("Tiger");
		l.addLast("Elephant");
		
		System.out.println(l); // [Tiger, dog, dog, cat, horse, Elephant]
		
		
       System.out.println(l.getFirst());
       System.out.println(l.getLast());
       
      // Remove first and last element
       l.removeFirst();
       l.removeLast();
	
	}

}

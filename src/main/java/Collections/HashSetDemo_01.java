package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo_01 {

	public static void main(String[] args) {
		// HashSet hs = new HashSet() ; // default capacity 16 Load Factor 0.75
		// HashSet hs = new HashSet(100); // initial capacity 100
		// HashSet hs = new HashSet(100,(float)0.90);
		//HashSet <Integer> hs = new HashSet<Integer>();
		
		HashSet hs = new HashSet(); // default capacity 16 Load Factor 0.75
		
		// Add objects/elements into HashSet
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		// remove()
		hs.remove(16.4); //value
		System.out.println("After removing element: "+hs);
		
		// contains()
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains("xyz"));
		
//		// Reading objects/elements from hashset using for-each loop
//		for (Object e : hs) {
//			System.out.println(e);
//		}
//		
		
		Iterator iterator = hs.iterator();
		// [null, A, 100, welcome, true]
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		



	}

}

package Collections;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo_03 {

	public static void main(String[] args) {

		// Union, Intersection, difference

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		System.out.println("Hashset 1: " +set1); //[1, 2, 3, 4, 5]

		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(10);

		System.out.println("Hashset 2: " +set2);//[3, 4, 5]

//		//union
		set1.addAll(set2);
//		System.out.println("Union:" + set1); //[1, 2, 3, 4, 5]
//
//		// intersection
		set1.retainAll(set2);
		System.out.println("Intersection:" + set1); //[3, 4, 5]

		// difference

		set1.removeAll(set2);
		System.out.println("difference " + set1);
		
		// subset
		set1.containsAll(set2);
		System.out.println("subset :" + set1);
        
		
	}

}

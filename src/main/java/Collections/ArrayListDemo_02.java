package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo_02 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");

		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup); // [X, Y, Z, A, B, C]

		al_dup.removeAll(al);
		System.out.println("After removing element from array list:" + al_dup); //[]

		// Sort ---- Collections.sort()
		System.out.println("Elements in the array list:" + al ); //[X, Y, Z, A, B, C]
		Collections.sort(al);
		System.out.println("Elements in the array list after sorting:" + al ); //[A, B, C, X, Y, Z]

		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in reverse order:" + al ); //[Z, Y, X, C, B, A]

		// Shuffling - Collections. shuffle()
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling:" + al ); // [Y, Z, C, A, X, B]

	}

}

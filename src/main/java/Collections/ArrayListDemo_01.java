package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo_01 {

	public static void main(String[] args) {

		List al = new ArrayList<>(); //Another way to create arrayList

		ArrayList arrayList = new ArrayList<>();
		arrayList.add("Deneme");
		arrayList.add("AIC");
		arrayList.add(15.5);
		arrayList.add(true);

		//size
		System.out.println(arrayList);
		System.out.println("Number of elements in array list: " +arrayList.size());

		// remove
		arrayList.remove(0);
		System.out.println("After removing element from array list:" + arrayList);

		// insert a new element
		arrayList.add(0, "Python");
		System.out.println("After insertiing a new element to the array list:" + arrayList);

		// retreive specific element
		System.out.println(arrayList.get(2));

		// change element
		arrayList.set(2, "C Language");
		System.out.println(arrayList);

		// search - contains() - Return true/false
		System.out.println(arrayList.contains("Python")); // true

		// isEmpty()
		System.out.println(arrayList.isEmpty()); //false

		// 1-) for loop
		System.out.println("Reading elements using for loop.....");
		for (int i = 0; i < arrayList.size(); i++) 
		{
			System.out.println(arrayList.get(i));


		}

		// 2-) for.each loop
		System.out.println("Reading elements using for-each loop.....");
		for (Object elements : arrayList) {

			System.out.println(elements);
		}

		// 3-) Iterator
		System.out.println("Reading elements using iterator method.....");
		Iterator it = arrayList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}







	}
}

package Collections;

import java.util.HashSet;

public class HashSetDemo_02 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber = new HashSet<Integer>();

		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("Hashset: " + evenNumber); //[2,4,6]
		

		HashSet<Integer> numbers= new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(10);
		
		System.out.println(numbers); //[2, 4, 6, 10]
		
		//removeAll()
		
		numbers.removeAll(evenNumber);
		System.out.println(numbers); //[10]


	}

}

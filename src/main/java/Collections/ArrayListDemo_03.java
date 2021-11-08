package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListDemo_03 {

	public static void main(String[] args) {
	
		String arr[] = {"Dog", "Cat", "Elephant"};
		
		for (String value : arr) {
			System.out.println(value);
		}

		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	 
	}

}

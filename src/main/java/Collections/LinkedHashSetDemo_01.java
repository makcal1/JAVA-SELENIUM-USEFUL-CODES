package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo_01 {

	public static void main(String[] args) {
	
	LinkedHashSet lset = new LinkedHashSet();
	lset.add(100);
	lset.add(200);
	lset.add(300);
	lset.add(400);
	lset.add(500);
	
	System.out.println(lset); //[100, 200, 300, 400, 500]
	
	///////// HASHSET ////////
	HashSet hset = new HashSet();
	hset.add(100);
	hset.add(200);
	hset.add(300);
	hset.add(400);
	hset.add(500);
	
	System.out.println(hset); //[400, 100, 500, 200, 300]

	}

}

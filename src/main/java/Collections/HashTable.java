package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		//	Hashtable t = new Hashtable(); // capacity is 11, load factor 0.75
		//	Hashtable t = new Hashtable(20,2) ; // create hashtable object with some capacity and load factor

		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		//t.put(104, null); //NullPointerException
		//	t.put(null, "X");//NullPointerException

		System.out.println(t); //{103=Smith, 102=David, 101=John}
		System.out.println(t.get(103)); //Smith

		t.remove(103);
		System.out.println(t); //{102=David, 101=John}

		System.out.println(t.containsKey(101));//true
		System.out.println(t.containsKey(106));//false
		System.out.println(t.containsValue("David"));//true
		System.out.println(t.isEmpty()); // false

		System.out.println(t.keySet()); //[102, 101]
		System.out.println(t.values()); //[David, John]

		for (int i : t.keySet()) {
			System.out.println(i + "  " + t.get(i));
			//			102  David
			//			101  John
		}
		
		 
		for (Map.Entry entry:t.entrySet()) { // (key,value)
			System.out.println(entry.getKey() + "  " + entry.getValue());
			//			102  David
			//			101  John
		}
		
		// iterator()
		Set set = t.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry =  (Entry) iterator.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}





	}

}

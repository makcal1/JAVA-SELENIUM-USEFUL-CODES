package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_01 {

	public static void main(String[] args) {

		//HashMap map = new HashMap();
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(101, "John");
		map.put(102, "David");
		map.put(103, "Scott");
		map.put(104, "Marry");
		map.put(105, "Tye");
		map.put(103, "XX");
		map.put(106, "Tye");

		System.out.println(map); //{101=John, 102=David, 103=Scott, 104=Marry, 105=Tye}
		System.out.println(map.get(105));//Tye

		map.remove(106); // remove pair from hashmap
		System.out.println(map);

		System.out.println(map.containsKey(101)); //true
		System.out.println(map.containsKey(107)); //false

		System.out.println(map.containsValue("Marry"));	//true
		System.out.println(map.containsValue("Y")); //false

		System.out.println(map.isEmpty()); //false

		//// ONLY GETTING KEYS FROM MAP////
		System.out.println(map.keySet()); //[101, 102, 103, 104, 105]
		for (Object i : map.keySet()) {
			System.out.println(i+ "  " + map.get(i));
			//			101  John
			//			102  David
			//			103  XX
			//			104  Marry
			//			105  Tye

		}

		//// ONLY GETTING VALUES FROM MAP////
		System.out.println(map.values()); //[John, David, XX, Marry, Tye]

		//// ONLY GETTING ENTRIES FROM MAP////
		System.out.println(map.entrySet()); //[101=John, 102=David, 103=XX, 104=Marry, 105=Tye]


		// Entry Methods
		// ********

		for (Map.Entry entry : map.entrySet()) { 
			System.out.println(entry.getKey() + "  " + entry.getValue());
			//			101  John
			//			102  David
			//			103  XX
			//			104  Marry
			//			105  Tye
		}

		// iterator()
		Set set= map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry=(Entry) iterator.next(); 
			System.out.println(entry.getKey() + "  " + entry.getValue());
			//			104  Marry
			//			105  Tye
			//			101 John
			//			102 David
			//			103 XX
			//			104 Marry
			//			105 Tye

		}











	}

}

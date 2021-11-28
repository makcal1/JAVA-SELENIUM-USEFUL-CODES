package Java_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class _04_StreamMethods_02 {

	public static void main(String[] args) {


		List<Integer> list1=Arrays.asList(2,4,1,3,7,5,9);
		//sorted
		List<Integer>sortedList =list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); // [1, 2, 3, 4, 5, 7, 9]

		// sort and reverse
		List<Integer>reverseSortedList =list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList); //[9, 7, 5, 4, 3, 2, 1]

		//Strings
		List<String> list2=Arrays.asList("John","Mary","Kim","David","Smith");
		//sorted
		List<String>sortedList2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2); //[David, John, Kim, Mary, Smith]

		// sort and reverse for String
		List<String>reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList2); // [Smith, Mary, Kim, John, David]

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		Set<String> fruits = new HashSet<String>(); 
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("Two grapes");
		fruits.add("Two guavas");

		//anyMatch()
		boolean result=	fruits.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println(result); //true

		//allMatch()
		boolean resultforAllMatch=	fruits.stream().allMatch(value-> {return value.startsWith("One")||value.startsWith("Two");});
		System.out.println(resultforAllMatch); //true

		//noneMatch()
		boolean resultforNonMatch =	fruits.stream().noneMatch(value-> {return value.startsWith("Three");});
		System.out.println(resultforNonMatch); //true

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		List<String> stringList=Arrays.asList("one","two","three","David","one");

		// findAny()
		Optional<String> optional1 = stringList.stream().findAny();
		System.out.println(optional1.get()); //one

		// findFirst()
		Optional<String> optional2 = stringList.stream().findFirst();
		System.out.println(optional2.get()); //one

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		List<String> animaList = Arrays.asList("dog","cat","elephant","poncik");
		List<String> birdList = Arrays.asList("peackock","parrot","crow");

		// concat()
		Stream<String> stream1 = animaList.stream();
		Stream<String> stream2 = birdList.stream();

		// List<String> concatList= Stream.concat(stream1, stream2).collect(Collectors.toList());
		List<String> concatList= Stream.concat(stream1, stream2).collect(Collectors.toList());
		Predicate<String> predicate = s->(s.startsWith("p"));
		
		for (String item : concatList) {
			System.out.println(item);
			/**
			Dog
			Cat
			Elephant
			peackock
			parrot
			Crow
				 * 
				 * 		
				 */
			if(predicate.test(item)) {
			//	System.out.println(item);
//				poncik
//				peackock
//				parrot
			}
			

		}













	}

}

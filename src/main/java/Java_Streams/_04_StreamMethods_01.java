package Java_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class _04_StreamMethods_01 {

	public static void main(String[] args) {

		//distinct() count() limit()

		List<String> vehicleList = Arrays.asList("bus","car","bcyle","bus","car", "car","bike");
		
		//distinct()
		List<String> distinctVehicles = vehicleList.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctVehicles); //[bus, car, bcyle, bike]

		vehicleList.stream().distinct().forEach(value->System.out.println(value)); //bus car bcyle bike


		//count
		long count = vehicleList.stream().distinct().count();
		System.out.println(count); //4

		//limit
		List<String> limitedVehiclesList=vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Vehicles: "+ limitedVehiclesList); //Limited Vehicles: [bus, car, bcyle]


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		// count()
		List<Integer> evenNumberList = new ArrayList();
		evenNumberList=	numberList.stream().filter(f->f%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList); // [2, 4, 6, 8, 10]
		long numberOfEvenNumbers = evenNumberList.stream().count();
		System.out.println("Number Of Even Numbers : " +numberOfEvenNumbers); //Number Of Even Numbers : 5


		List<Integer> numberList2 = Arrays.asList(11,1,2,3,4,5,6,7,8,9,10);
		// min()
		Optional<Integer> min=  numberList2.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get()); //1

		// max()
		Optional<Integer> max=  numberList2.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get()); //11

		// reduce()
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		Optional<String> reducedValue = stringList.stream().reduce((value, combinedvalue)->{return combinedvalue+value;}); // A+B

		System.out.println(reducedValue.get()); //321CBA

		// toArray()
		List<String> arrayList = Arrays.asList("A","B","C","1","2","3");
		Object[] object = arrayList.stream().toArray();
		List<Object> aList = Arrays.asList(object);

		Iterator<Object> iterator = aList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			/*******************************************
						A
						B
						C
						1
						2
						3
			 ***********************************************/
		}


	}

}

package Java_Streams;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _02_Map_01 {

	public static void main(String[] args) {

		List<String> vehicle = Arrays.asList("bus","car","bicyle","flight","train");

		List<String> vehiclesListUpperCase = vehicle.stream().map(n->n.toUpperCase()).collect(Collectors.toList());

		System.out.println(vehiclesListUpperCase); //[BUS, CAR, BICYLE, FLIGHT, TRAIN]


		/********************************************************* 
		   without using streams
		for (String name: vehicles) {
			vehiclesListUpperCase.add(name.toUpperCase());			
		} 

		 **********************************************************/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<String> vehicles = Arrays.asList("bus","car","bicyle","flight","train");

		// 1-->  vehicles.stream().map(vehicleName->vehicleName.length()).forEach(len->System.out.println(len));

		vehicles.stream().map(vehicleName->vehicleName.length()).forEach(System.out::println); // <--2

		/**
		   3
		   3
           6
		   6
		   5

		 */
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		List<Integer> numberList = Arrays.asList(2,3,4,5);

		List<Integer> multipliedList = new ArrayList<Integer>();

		/*****************************************************

	for (int number : numberList) {

		multipliedList.add(number*3);
	}
	System.out.println(multipliedList);
		 *******************************************************/

		multipliedList = numberList.stream().map(num->num*3).collect(Collectors.toList());

		multipliedList.forEach(System.out::println);
		/**
		   6
		   9
		   12
		   15
		 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	}

}

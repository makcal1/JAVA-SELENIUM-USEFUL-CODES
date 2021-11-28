package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _02_Map_01 {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus","car","bicyle","flight","train");

		List<String> vehiclesListUpperCase = vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());

		System.out.println(vehiclesListUpperCase); //[BUS, CAR, BICYLE, FLIGHT, TRAIN]


		/********************************************************* 
		   without using streams
		for (String name: vehicles) {
			vehiclesListUpperCase.add(name.toUpperCase());			
		} 

		 **********************************************************/





	}

}

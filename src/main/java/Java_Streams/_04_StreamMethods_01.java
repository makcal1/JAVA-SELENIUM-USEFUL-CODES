package Java_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;



//distinct() count() limit()
public class _04_StreamMethods_01 {

	public static void main(String[] args) {

		List<String> vehicleList = Arrays.asList("bus","car","bcyle","bus","car", "car","bike");

		List<String> distinctVehicles = vehicleList.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctVehicles); //[bus, car, bcyle, bike]

		vehicleList.stream().distinct().forEach(value->System.out.println(value)); //bus car bcyle bike


		//count
		long count = vehicleList.stream().distinct().count();
		System.out.println(count); //4

		//limit
		List<String> limitedVehiclesList=vehicleList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Vehicles: "+ limitedVehiclesList); //Limited Vehicles: [bus, car, bcyle]







	}

}

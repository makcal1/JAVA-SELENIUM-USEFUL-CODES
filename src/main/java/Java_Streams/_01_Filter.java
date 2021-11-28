package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _01_Filter {

	public static void main(String[] args) {


		List<Integer> numbersList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumbersList = new ArrayList<Integer>();

		evenNumbersList= numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList); //[10, 20, 30]

	}

}

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



class Studentka{
	String name;
	int score;

	public Studentka(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
}

public class _05_ParalelStreams_01 {

	public static void main(String[] args) {

		List<Studentka> studentList = Arrays.asList(
				new Studentka("David", 82),
				new Studentka("Bob", 90),	
				new Studentka("John", 65),	
				new Studentka("Canedy", 55),	
				new Studentka("Eric", 85),	
				new Studentka("Smith", 88),	
				new Studentka("Scott", 50));

		// using normal stream() - sequencial
		studentList.stream().filter(s-> s.getScore()>=80)
		.limit(3) 
		.forEach(stu->System.out.println(stu.getName() + " " + stu.getScore())); // David 82 Bob 90 Eric 85
		
//*************************************************************************************************************************************************************************//		

		// parallel stream()
		studentList.parallelStream().filter(s-> s.getScore()>=80)
		.limit(3) 
		.forEach(stu->System.out.println(stu.getName() + " " + stu.getScore())); // David 82 Bob 90 Eric 85

//**************************************************************************************************************************************************************************//		

		// convert stream --> parallelStream()
		studentList.stream().parallel()
		.filter(s-> s.getScore()>=80)
		.limit(3) 
		.forEach(stu->System.out.println(stu.getName() + " " + stu.getScore())); // David 82 Bob 90 Eric 85






	}

}

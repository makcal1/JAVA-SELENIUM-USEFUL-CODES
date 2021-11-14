package Lambda_Expression;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateInterface_01 {

	public static void main(String[] args) {
		
		//Ex1 :
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20)); //true
		
	
		
		//Ex2 :check the length of given string is equal,greater than 4 or not
		Predicate<String> pr = s->(s.length()>=4);
		System.out.println(pr.test("Mami")); //true
		
		//Ex3: Print array elements whose size is > 4 from array
		Predicate<String> condition = s->(s.length()>=4);
		String names[] = {"David","Scott","Smith","John","Marry"};
		for (String name : names) {
			if(condition.test(name)) {
				System.out.println("These element size > 4 : " + name);
			}
			}
			
		}}
		
	

	


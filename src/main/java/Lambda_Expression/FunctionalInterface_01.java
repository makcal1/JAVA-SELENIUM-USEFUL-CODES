package Lambda_Expression;

import java.util.function.Function;

public class FunctionalInterface_01 {

	public static void main(String[] args) {
	
		Function<Integer, Integer> f = n->n*n;
		System.out.println(f.apply(5)); //25
		
		
		Function<String, Integer> fn = s->s.length();
		System.out.println(fn.apply("Welcome")); //7

	}

}

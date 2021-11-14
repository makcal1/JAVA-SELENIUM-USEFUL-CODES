package Lambda_Expression;

import java.util.function.Function;

/**
 * 
 * @Function Chaining
 * 
 * ---
 * andThen()
 * compose()
 */
public class FunctionalInterface_03 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n->n*2;
		Function<Integer, Integer> f2 = n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2)); //64 <-- First f1, and f2 will be executed
		
		System.out.println(f1.compose(f2).apply(2)); // 16 <-- First f2, and f1 will be executed
		


	}

}

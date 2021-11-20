package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Predicate;

// Joining Predicates - and , or , negate
// p1 -- checks number is even
// p2 -- checks number is greater than 50

class NumberClass{
	int number;

	public NumberClass(int numr) {

		this.number = numr;
	}

}

public class PredicateInterface_03 {

	public static void main(String[] args) {

		//First Example
		Predicate<NumberClass> condition = s->(s.number%2==0);
		Predicate<NumberClass> condition2 = s->(s.number>50);


		ArrayList<NumberClass> numberClasses = new ArrayList<NumberClass>();
		numberClasses.add(new NumberClass(21));
		numberClasses.add(new NumberClass(22));
		numberClasses.add(new NumberClass(201));
		numberClasses.add(new NumberClass(202));
		numberClasses.add(new NumberClass(203));
		numberClasses.add(new NumberClass(204));
		numberClasses.add(new NumberClass(205));
		numberClasses.add(new NumberClass(206));

		for (NumberClass numberClass : numberClasses) {

			if(condition.and(condition2).test(numberClass)) {
				System.out.println(numberClass.number);
				//				202
				//				204
				//				206
			}
		}
//----------------------------------------------------------------------------------------------------------//
		//Second Example
		int a[] = {5,15,20,25,30,35,40,45,50,55,60,65,70};
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>50;

		for (int number : a) {
			if(p1.and(p2).test(number))
			{
				//System.out.println(number);
				//			60
				//			70
			}
		}
		Predicate<Integer> p3 = s->s%2==0;

		// Second Example with negate(opposite condition)
		for (int number : a) {
			if(p3.negate().test(number))
			{
				System.out.println(number);
				//				5
				//				15
				//				25
				//				35       <------ ODD Number(opposite condition)
				//				45
				//				55
				//				65
			}
		}

	}

}

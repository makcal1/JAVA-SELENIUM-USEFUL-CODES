package Lambda_Expression;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_01 {

	public static void main(String[] args) {
	
		
		Supplier<Date> supplier=()-> new Date();
		
		System.out.println(supplier.get());

	}

}

package Lambda_Expression;

import java.util.function.Consumer;

public class Consumer_01 {

	public static void main(String[] args) {
		
		Consumer<String> consumer = s-> System.out.println(s);
		
		consumer.accept("Welcome");
	
	
	
	}

}

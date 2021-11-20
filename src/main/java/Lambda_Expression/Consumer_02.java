package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Customers
{
	String ename;
	int salary;
	String gender;
	public Customers(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}


}

public class Consumer_02 {

	public static void main(String[] args) {

		ArrayList<Customers> emplist = new ArrayList<Customers>();
		emplist.add(new Customers("David",50000,"Male"));
		emplist.add(new Customers("John",30000,"Male"));
		emplist.add(new Customers("Mary",20000,"Female"));
		emplist.add(new Customers("Scott",60000,"Male"));

		//Function		
		Function<Customers, Integer> function = emp->(emp.salary*10)/100;

		// Predicate
		Predicate<Integer> predicate = b->b>= 5000;

		//Consumer
		Consumer<Customers> consumer = emp->{System.out.println(emp.ename + " " + emp.salary + " " + emp.gender);};


		for (Customers employee : emplist) 
		{
			int bonus = function.apply(employee);

			if(predicate.test(bonus)) {
				consumer.accept(employee);
				System.out.println("Employee bonus : " + bonus);
				
				/**
				David 50000 Male
				Employee bonus : 5000
				Scott 60000 Male
				Employee bonus : 6000

					 */
			}
		}
	}

}

package Lambda_Expression;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Workers
{
	String ename;
	int salary;

	Workers(String ename,int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}
public class FunctionalInterface_02 {

	public static void main(String[] args) {

		ArrayList<Workers> employeList = new ArrayList<Workers>();
		employeList.add(new Workers("Olga",50000));
		employeList.add(new Workers("John",30000));
		employeList.add(new Workers("Mary",20000));

		//Function
		Function<Workers, Integer> fn = e->{
			int sal = e.salary;

			if(sal>=10000 && sal<=20000)
				return (sal *10/100);
			else if(sal>20000 && sal<=30000)
				return (sal *20/100);
			else if(sal>30000 && sal<=50000)
				return (sal *30/100);
			else
				return (sal*40/100);
		};

		//Predicate
		Predicate<Integer> p = b->b>5000;

		// Consumer
		Consumer<Workers> consumer = employee -> {System.out.println("Employee Name -> " + employee.ename + " ||" +" Salary :" + employee.salary);};

		for (Workers employee : employeList) {
			int bonus=	fn.apply(employee); // Function
			if(p.test(bonus)){ // Predicated
				consumer.accept(employee);
				System.out.println("Employee bonus : " + bonus);


			}

		}
		/**
		Employee Name -> Olga || Salary :50000
		Employee bonus : 15000
		Employee Name -> John || Salary :30000
		Employee bonus : 6000

		 */

	}

}

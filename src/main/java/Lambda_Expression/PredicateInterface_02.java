package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experience;
	int employeeNumber;

	public Employee(String name,int sal,int exp,int eNumber) 
	{
		ename =name;
		salary=sal;
		experience=exp;
		employeeNumber = eNumber;
	}
}
public class PredicateInterface_02 {

	public static void main(String[] args) {

		// Ex1:
		Employee employee = new Employee("John",5000,5,2022);

		Predicate<Employee> condition1 = s->(s.salary>3000 && s.experience>3);

		System.out.println(condition1.test(employee)); //true

		Predicate<Employee> condition2= s->(s.employeeNumber>=2020);
//----------------------------------------------------------------------------------------------------------//
		
		// Ex2:
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("John" ,50000,5,2012));
		al.add(new Employee("David",20000,2,2005));
		al.add(new Employee("Scott",30000,3,2020));
		al.add(new Employee("Marry",40000,6,2030));

		for (Employee e : al) {
			if(condition1.and(condition2).test(e))
			{
				System.out.println(e.ename + "  " + e.salary + "   " + e.employeeNumber); //Marry  40000   2030
				
			}
		}


	}

}

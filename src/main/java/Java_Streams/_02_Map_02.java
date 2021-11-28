package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Isciler 
{
	 int empid;
	 String empname; 
	 int salary;
	public Isciler(int empid, String empname, int salary) {
		
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	
}
public class _02_Map_02 {

	
	public static void main(String[] args) {
	List<Isciler> employeeList = Arrays.asList(
			new Isciler(101,"Alex",10000),
			new Isciler(102,"Brian",20000),
			new Isciler(103,"Charles",30000),
			new Isciler(104,"David",40000),
			new Isciler(105,"Edward",60000),
			new Isciler(105,"Edward",70000),
			new Isciler(105,"Edward",80000),
			new Isciler(105,"Edward",100000),
			new Isciler(105,"Edward",150000)
			
			);
	
	// Combination of filter and map
	List<Integer> empSalaryList = new ArrayList<Integer>();
	
	empSalaryList=  employeeList.stream().filter(e->e.salary > 30000).filter(e->e.salary <100000).map(e->e.salary).collect(Collectors.toList());
	
	System.out.println(empSalaryList); //[40000, 60000, 70000, 80000]
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

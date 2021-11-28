package Java_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

	String sname;
	int sid;
	char grade;
	public Student(String sname, int sid, char grade) {
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}


}

public class _03_FlatMap_02 {

	public static void main(String[] args) {

		List<Student> studentList1= new ArrayList<Student>();
		studentList1.add(new Student("Smith",101,'A'));
		studentList1.add(new Student("John",102,'B'));
		studentList1.add(new Student("Kenedy",103,'C'));


		List<Student> studentList2= new ArrayList<Student>();
		studentList2.add(new Student("Scott",104,'A'));
		studentList2.add(new Student("Marry",105,'B'));
		studentList2.add(new Student("Kitty",106,'C'));


		List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);

		List<String> studentNames=	studentList.stream().flatMap(fMap->fMap.stream()).map(m->m.sname).collect(Collectors.toList());

		System.out.println(studentNames); //[Smith, John, Kenedy, Scott, Marry, Kitty]

		studentNames.forEach(f->System.out.println("Student Name : "+f));

		/**
Student Name : Smith
Student Name : John
Student Name : Kenedy
Student Name : Scott
Student Name : Marry
Student Name : Kitty
		 */


	}}













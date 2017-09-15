package stream_API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamOperations {
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Suraj", "Nimankar", 10000, 21),
											 new Employee("Sachin", "Birajdar", 10011, 22),
											 new Employee("Niranjan", "Pai", 8000, 23),
											 new Employee("Amit", "Agarwal", 12000, 24),
											 new Employee("Udayan", "Gupta", 9000, 25),
											 new Employee("Akshay", "Borase", 8500, 26));
	
		// filter employees on specific salary criteria.
		List<Employee> filteredEmployees = employees.parallelStream().filter((Employee employee) -> employee.getSalary() >= 10000).collect(Collectors.toList());
		filteredEmployees.forEach(System.out::println);
		System.out.println("*************************************************************************");
		
		//sorting list
		List<String> names = Arrays.asList("Suraj", "Sachin", "Amit", "Niranjan", "Udayan", "Akshay");
		Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
		names.forEach(System.out::println);
		System.out.println("*************************************************************************");
		
		names = Arrays.asList("Suraj", "Sachin", "Amit", "Niranjan", "Udayan", "Akshay");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("*************************************************************************");
		
		//Randomly print 10 numbers
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		System.out.println("*************************************************************************");
		
		//print unique squares of a number
		List<Integer> integers = Arrays.asList(2,2,3,3,4,4,5,5,2,3,4,5);
		
		//map method is used to map each element to its corresponding result
		// distinct method returns a stream consisting of distinct elements (according to obj1.equals(obj2)) of this stream.
		List<Integer> squares = integers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		squares.forEach(System.out::println);
		System.out.println("*************************************************************************");
		
		//count empty strings
		List<String> emptynames = Arrays.asList("Suraj", "", "Amit", "Niranjan", "", "Akshay");
		long count = emptynames.stream().filter(name -> name.isEmpty()).count();
		System.out.println("Count is: " + count);
		System.out.println("*************************************************************************");
		
		// get highest number from a list.
		integers = Arrays.asList(2,2,3,3,4,4,5,5,2,3,4,5, 100, 999, 10);
		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Max Number: " + stats.getMax());
		System.out.println("Min Number: " + stats.getMin());
		System.out.println("Avg Number: " + stats.getAverage());
		System.out.println("Sum Number: " + stats.getSum());
		System.out.println("*************************************************************************");
		
		//Find Next Monday
		LocalDate today = LocalDate.now();
		System.out.println("Today is: " + today);
		LocalDate nextMon = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("Next Monday is on: " + nextMon);
	}

}
class Employee {
	private String firstname;
	private String lastName;
	private double salary;
	private int age;
	
	public Employee(String firstname, String lastName, double salary, int age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Employee Name: " + this.firstname + " " + this.lastName + " Salary: " + this.salary;
	}
}
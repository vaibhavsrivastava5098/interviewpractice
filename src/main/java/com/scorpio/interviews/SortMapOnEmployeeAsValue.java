package com.scorpio.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortMapOnEmployeeAsValue {

	public static void main(String[] args) {

		Employee e1 = new Employee("Gaurav@yahoo.com", 15000, "Gaurav");
		Employee e2 = new Employee("Vaibhav@yahoo.com", 10000, "Vaibhav");
		Employee e3 = new Employee("Kanti@yahoo.com", 5000, "Kanti");
		Employee e4 = new Employee("Amit@yahoo.com", 20000, "Amit");

		
		
		
		/*
		 * HashMap<String, Employee> employeeMap = new HashMap<>();
		 * employeeMap.put("Gaurav@yahoo.com", e1); employeeMap.put("Vaibhav@yahoo.com",
		 * e2); employeeMap.put("Kumud@yahoo.com", e3);
		 * employeeMap.put("Amit@yahoo.com", e4);
		 * 
		 * LinkedHashMap<String, Employee> lhm = employeeMap.entrySet().stream()
		 * .sorted(Map.Entry.comparingByValue((o1, o2) ->
		 * o1.getName().compareTo(o2.getName())))
		 * .collect(Collectors.toMap(Map.Entry<String, Employee>::getKey,
		 * Map.Entry::getValue, (oldval, newval) -> oldval, LinkedHashMap::new));
		 * lhm.entrySet().stream().forEach(entry -> System.out
		 * .println("the email id is: " + entry.getKey() + " the employee is :" +
		 * entry.getValue().getName()));
		 */
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4);
		List<Employee> collect = employees.stream().map(e->
								{
									e.setSalary(e.getSalary()*5);
									return e;
								}).collect(Collectors.toList());
		collect.stream().forEach(e->System.out.println(e.getSalary()));
		 
	}
}

class Employee {
	String emailId;
	int salary;
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String emailId, int salary, String name) {
		super();
		this.emailId = emailId;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [emailId=" + emailId + ", salary=" + salary + ", name=" + name + "]";
	}
	
	

}

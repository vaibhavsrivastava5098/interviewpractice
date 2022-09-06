package com.scorpio.interviews;

import java.util.HashSet;
import java.util.Set;

class Gfg{
    //Function to reverse the queue.
	/*
	 * public Queue<Integer> rev(Queue<Integer> q){ return q; //add code here. }
	 */
	public static void main(String[] args) {
		
	Employee e1 = new Employee("Gaurav@yahoo.com", 15000, "Gaurav");
	Employee e2 = new Employee("Vaibhav@yahoo.com", 10000, "Vaibhav");
	Employee e3 = new Employee("Kanti@yahoo.com", 5000, "Kanti");
	Employee e4 = new Employee("Amit@yahoo.com", 20000, "Amit");
	Employee e5 = new Employee("Vaibhav@yahoo.com", 11000, "Vaibhav");

	Set<Employee> set = new HashSet<>();
	set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	
	

	// for (Employee employee : set) {
	// System.out.println(employee);
	// }

	set.stream().forEach(s -> System.out.println(s));
	}
	
}
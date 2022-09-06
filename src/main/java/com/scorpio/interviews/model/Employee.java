package com.scorpio.interviews.model;

public class Employee
{
	String name;
	int age;
	String emailId;
	
	public Employee(String name, int age, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

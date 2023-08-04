package com.lumen.inter;

public abstract class Employee implements Insurance {
	String name;
	int employeeid;
	double salary;
	
	public Employee(String name, int employeeid, double salary) {
		super();
		this.name = name;
		this.employeeid = employeeid;
		this.salary = salary;
	}
	void printDetails() {
		System.out.println("details of employee");
		
	}
	abstract String[] showCourses();

}

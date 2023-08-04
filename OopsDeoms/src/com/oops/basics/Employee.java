package com.oops.basics;
public class Employee {
	/*String empName;
	int empId;
	double salary;
	
	Employee (String name,int id,double sal){
		empName=name;
		empId=id;
		salary=sal;
	}
	
	void printDetails() {
		System.out.println("employee name"+empName);
		System.out.println("employee id"+empId);
		System.out.println("employee salary"+salary);
	}
	String greet(String msg) {
		return msg+empName;
	}
	*/
	String empName;
	int empId;
	double salary;
	
	Employee (String empName,int empId,double salary){
		this.empName=empName;
		this.empId=empId;
		this.salary=salary;
	}
	void printDetails() {
		System.out.println("employee name"+empName);
		System.out.println("employee id"+empId);
		System.out.println("employee salary"+salary);
	}
		
	}
	



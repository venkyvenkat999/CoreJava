package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee=new Employee("Ram",12,2000.0);
//		System.out.println(employee.empName);//null
//		System.out.println(employee.empId);//id
//		employee.empName="venkat";
//		employee.empId=12;
//		employee.salary=2000;
		
		employee.printDetails();
//		String result=employee.greet("great day");
//		System.out.println(result);
	
		//2 nd
		Employee employee1=new Employee("priya",10,88999);
		
		employee1.empName="ramesh";
		employee1.empId=10;
		employee1.salary=12000;
//		System.out.println(employee1.greet("welcome"));
		
//		System.out.println("employee1 name"+employee1.empName);
//		System.out.println("employee1 id"+employee1.empId);
//		System.out.println("employee1 name"+employee1.salary);
//		
//		Employee employee2=employee;
//		employee2.empName="raju";
//		System.out.println("employee name:"+employee.empName);
//		System.out.println("employee name:"+employee2.empName);
//		
//		//make employee null
//		employee=null;
//		System.out.println("employee name:"+employee.empName);
//		System.out.println("employee2 name:"+employee2.empName);
//		
		
	}
	
}

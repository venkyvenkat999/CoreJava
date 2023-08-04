package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		Employee employee=new Employee("venkatesh","Director");
		Employee employee1=new Employee("jaanu","Manager");
		Employee employee2=new Employee("dayakar","Programmer");
		
		double result=employee.calcBonus(60000, 690, 8000);
		double result1=employee1.calcBonus(80000,700);
		double result2=employee2.calcBonus(70000);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

	}

}

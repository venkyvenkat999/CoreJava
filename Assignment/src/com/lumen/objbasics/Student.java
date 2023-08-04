package com.lumen.objbasics;

public class Student {
	String name;
	String Department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.Department = department;
	}
	void printDetails() {
		System.out.println("name: "+name);
		System.out.println("department"+Department);
	}
	void  getDetails(int...marks) {
		int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
		if(sum<=100 && sum>90)
			System.out.println("A grade");
		else if(sum>=80 && sum<90)
			System.out.println("B grade");
		else if(sum>=70 && sum<80)
			System.out.println("C grade");
		else if(sum>=60 && sum<70)
			System.out.println("D grade");
		else if(sum>=50 &&  sum<59)
			System.out.println("E grade");
		else
			System.out.println("fail");

		
	}

}
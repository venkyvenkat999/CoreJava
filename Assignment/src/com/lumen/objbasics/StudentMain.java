package com.lumen.objbasics;

public class StudentMain {
	public static void main(String[] args) {
		Student student=new Student("venkatesh","cse");
		Student student1=new Student("varun","ece");
		student.printDetails();
		student.getDetails(40,40,20);
		student1.printDetails();
		student.getDetails(40,40,10);

		
		
	}

}

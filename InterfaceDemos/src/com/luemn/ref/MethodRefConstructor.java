package com.luemn.ref;

import java.util.Arrays;
import java.util.List;

class Course{
	String courseName;
	void show() {
		System.out.println("show courses");
	}
}

interface CourseDetails{
	//List<String> showCourses();
	Course getCourse();
}
public class MethodRefConstructor {
public static void main(String[] args) {
//	CourseDetails courseDetails=()->Arrays.asList("java","python","sql","js");
//							courseDetails.showCourses()
//							.forEach(coursenames->System.out.println(coursenames));
	//using lambda function
	CourseDetails courseDetails=()->new Course();
	System.out.println(courseDetails.getCourse());//object
	Course course=courseDetails.getCourse();
	course.show();
	//using cons
	CourseDetails courseDetails1=Course::new;
	course=courseDetails.getCourse();
	course.show();

//	
}
}

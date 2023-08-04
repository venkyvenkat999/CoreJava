package com.lumen.inter;

public class Developer extends Employee implements Ientertainments, Gamer {

	public Developer(String name, int employeeid, double salary) {
		super(name, employeeid, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vehicleInsurance() {
		// TODO Auto-generated method stub
		System.out.println("this vehicle insurance in developer");


	}

	@Override
	public void healthInsurance() {
		// TODO Auto-generated method stub
		System.out.println("this health insurance in developer");


	}

	@Override
	public void outdoor() {
		// TODO Auto-generated method stub
		System.out.println("this is outdoor in developer");


	}

	@Override
	public void indoor() {
		// TODO Auto-generated method stub
		System.out.println("this is indoor in developer");


	}

	@Override
	public void showTrips() {
		// TODO Auto-generated method stub
		System.out.println("this is show trips in developer");


	}

	@Override
	String[] showCourses() {
		// TODO Auto-generated method stub
		System.out.println("this is showcourses in developer");

		return null;
	}
	void showProjects() {
		System.out.println("this is showprojects in developer");

	}
}

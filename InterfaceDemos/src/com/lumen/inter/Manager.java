package com.lumen.inter;

public class Manager extends Employee implements Ientertainments {

	public Manager(String name, int employeeid, double salary) {
		super(name, employeeid, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vehicleInsurance() {
		System.out.println("this vehicle insurance in manager");
	}

	@Override
	public void healthInsurance() {
		// TODO Auto-generated method stub
		System.out.println("this health insurance in manager");


	}

	@Override
	public void showTrips() {
		// TODO Auto-generated method stub
		System.out.println("this showTrips insurance in manager");


	}

	
	@Override
	String[] showCourses() {
		// TODO Auto-generated method stub
		System.out.println("this show courses in manager");

		return null;
	}
	void calculateBonus() {
		System.out.println("this is calculate bouns");
		
	}

}

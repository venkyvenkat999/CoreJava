package com.lumen.inter;

public class ClassManager {

	public static void main(String[] args) {
		Employee manager=new Manager("venkatesh",12,6000000);
		manager.printDetails();
		manager.showCourses();
		manager.healthInsurance();
		manager.vehicleInsurance();
		
		Insurance insurance=manager;
		insurance.healthInsurance();
		insurance.vehicleInsurance();
		
		Ientertainments entertainments=(Ientertainments)manager;
		entertainments.showTrips();
		
		Manager manage=(Manager)manager;
		manage.calculateBonus();
	}

}

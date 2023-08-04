package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vehicle vehicle = new Vehicle();
	vehicle.print();
	System.out.println();
	vehicle = new Vehicle("A100");
	vehicle.print();
	System.out.println();
	vehicle = new Vehicle("A100",1200000);
	System.out.println();
	vehicle.print();
	vehicle = new Vehicle("A100","Audi",90000);
	vehicle.print();

	}

}

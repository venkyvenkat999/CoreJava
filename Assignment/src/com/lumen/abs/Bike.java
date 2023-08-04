package com.lumen.abs;

public class Bike extends Vehicle {

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println("gives more mailege");

	}

	@Override
	void showType() {
		
		if(model.equals("sports")) {
			System.out.println("this is sports bike");
		}
		else if(model.equals("ktm")) {
			System.out.println("this is ktm");
		}
		else if(model.equals("ducati")) {
			System.out.println("this is ducati");
		}
		else
			System.out.println("this is bike showtype");
	}
	void engineType() {
		if(brand.equals("c6")) {
			System.out.println("this is c6 engine");
		}
		else if(brand.equals("z73")) {
			System.out.println("this is z73 engine");
		}
		else
			System.out.println("this is engineType");
	}

}

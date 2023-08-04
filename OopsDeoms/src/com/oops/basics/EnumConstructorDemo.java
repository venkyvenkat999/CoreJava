package com.oops.basics;

enum VehicleDetails {
	HONDA("HONDA",9000),
	AUDI("A100",700000),
	MAHINDRA("THAR",50000),
	BMW("BWM 900",120000);
	 private String model;
	 private double price;
	private VehicleDetails(String model, double price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	double price() {
		return 0;
	}
}
public class EnumConstructorDemo {

	public static void main(String[] args) {
		VehicleDetails vehicledetails=VehicleDetails.AUDI;
		System.out.println("model"+vehicledetails.getModel());
		System.out.println("price:"+vehicledetails.getPrice());
		
		String modelofHonda=VehicleDetails.HONDA.getModel();
		double priceofHond=VehicleDetails.HONDA.getPrice();
		System.out.println(modelofHonda);
		System.out.println(priceofHond);

		
	}

}

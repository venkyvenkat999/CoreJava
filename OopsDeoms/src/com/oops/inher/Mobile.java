package com.oops.inher;

public class Mobile extends Electronics {
	String cameraType;
	public Mobile(String model, String brand, double price,String cameraType) {
		super(model, brand, price);
	}
	void showCameraType() {
		System.out.println(this.cameraType);
	}
	

	
}

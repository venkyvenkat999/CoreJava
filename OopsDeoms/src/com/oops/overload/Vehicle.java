package com.oops.overload;

public class Vehicle {
String model;
String brand;
double price;
public Vehicle() {
	super();
}
public Vehicle(String model) {
	// TODO Auto-generated constructor stub
	this();
	this.model=model;
	System.out.println("one param"+model);
}
public Vehicle(String model, double price) {
	this(model);
//	this.model = model;
	this.price = price;
	System.out.println("two param"+model+price);
}
public Vehicle(String model, String brand, double price) {
//	this.model = model;
	this(model,price);
	this.brand = brand;
//	this.price = price;
	System.out.println("three param"+model+brand+price);
}
void print() {
	if(model!=null)
	System.out.println("model"+model);
	if(brand!=null)
	System.out.println("brand"+brand);
	if(price>0)
	System.out.println("price"+price);
}

}

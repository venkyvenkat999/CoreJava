package com.oops.override;

public class Triangle extends Shaper {

	@Override
	void area(int x, int y) {
		System.out.println("Area of triangle"+(0.5*x*y));
	}

	@Override
	void greet() {
		System.out.println("welcome");
	}
	

}

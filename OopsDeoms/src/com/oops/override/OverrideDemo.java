package com.oops.override;

public class OverrideDemo {
	public static void main(String[] args) {
		Shaper shaper=new Triangle();
		shaper.area(12,45);
		shaper.greet();
		
		shaper = new Rectangle();
		shaper.area(12,20);
	}
	

}

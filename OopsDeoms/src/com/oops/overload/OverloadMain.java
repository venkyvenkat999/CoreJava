package com.oops.overload;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.calcArea(10);
		shape.calcArea(2.0);
		int rect=shape.calcArea(10,20);
		System.out.println("rect"+rect);
		double tri=shape.calcArea(12.0,4);
		System.out.println(tri);

	}

}

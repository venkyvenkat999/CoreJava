package com.lumen.fun;

public class ShapeFactory {
	void printArea(Shape shape,double x,double y) {
		System.out.println("print area");
		double rectangle = shape.calArea(10, 20);
		System.out.println("area"+rectangle);
		System.out.println("done");
	}
}

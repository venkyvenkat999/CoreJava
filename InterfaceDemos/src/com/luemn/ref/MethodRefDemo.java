package com.luemn.ref;

class Shape{
	public void rectangleArea(double x,double y) {
		System.out.println(x*y);
	}
public static void triarea(double x,double y) {
	System.out.println((0.5*x*y));
}
}
public class MethodRefDemo {

	public static void main(String[] args) {
		AreaCalculator areaCalculator=( x, y)->System.out.println(x*y);
		areaCalculator.calArea(10,20);
		
		Shape myshape=new Shape();
		AreaCalculator areCalculator=myshape::rectangleArea;
		areaCalculator.calArea(10,30);


	}

}

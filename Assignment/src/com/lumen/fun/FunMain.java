package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		ShapeFactory shapefactory=new ShapeFactory();
		shapefactory.printArea(( x,y)->{
			System.out.println("Rectangle : "+ (x*y));
			return x*y;
		}, 10, 20);
		
		//shapefactory=new ShapeFactory();
		shapefactory.printArea(( x,y)->{
			System.out.println("Triange : "+ (0.5*x*y));
			return 0.5*x*y;
		}, 10, 20);
		
		
		
	}

}

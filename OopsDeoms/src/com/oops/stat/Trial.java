package com.oops.stat;

public class Trial {
	static int x;
	static int y;
	
	static {
		System.out.println("in static block");
		x=200;
	}
	static {
		System.out.println("in static block2");
		x=400;
	}
	static void getMessage() {
		System.out.println("static method");
		System.out.println("sum"+(x+y));
	}
	public static void main(String[] args) {
		System.out.println("in main");
//		call static method direclty as it in main class
		
	getMessage();
	}

}
